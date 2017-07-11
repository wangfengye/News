package com.ascend.wangfeng.news;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ascend.wangfeng.news.bean.ResultsBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<ArrayList<ResultsBean>> {

    public static final int LOADER_ID = 1;
    public static final String TAG = MainActivity.class.getName();
    private ArrayList<ResultsBean> data;
    private MyAdapter adapter;
    private ListView listView;
    private int count;
    private Loader<ArrayList<ResultsBean>> loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();

    }

    @Override
    protected void onResume() {
        loader=getSupportLoaderManager().initLoader(LOADER_ID, null, this);
        loader.forceLoad();
        super.onResume();
    }

    private void initView() {
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> view, View view1, int i, long l) {
                String url = data.get(i).getWebUrl();
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }

    private void initData() {
        data = new ArrayList<>();
        adapter = new MyAdapter(data, this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, R.string.refreshing, Toast.LENGTH_SHORT).show();
        if (loader!=null)
        loader.forceLoad();//refresh data
        return super.onOptionsItemSelected(item);
    }


    @Override
    public Loader<ArrayList<ResultsBean>> onCreateLoader(int id, Bundle args) {
        return new ResultsLoader(MainActivity.this);
    }

    @Override
    public void onLoadFinished(Loader<ArrayList<ResultsBean>> loader, ArrayList<ResultsBean> data) {
        if (data.size() <= 0) {
            Toast.makeText(this, R.string.refresh_error, Toast.LENGTH_SHORT).show();
            return;
        }
        this.data.clear();
        this.data.addAll(data);
        adapter.notifyDataSetChanged();
        Log.i(TAG, "onLoadFinished: "+count);
        count++;
        Toast.makeText(this, R.string.refersh_success, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoaderReset(Loader<ArrayList<ResultsBean>> loader) {
        this.data.clear();
    }
}
