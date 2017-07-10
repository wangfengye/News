package com.ascend.wangfeng.news;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ascend.wangfeng.news.bean.ResultsBean;
import com.ascend.wangfeng.news.util.HttpClient;
import com.ascend.wangfeng.news.util.JsonConversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ArrayList<ResultsBean> data;
    private MyAdapter adapter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
        getSearch();
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
                startActivity(intent);
            }
        });
    }

    private void initData() {
        data =new ArrayList<ResultsBean>();
        adapter =new MyAdapter(data,this);

    }

    /**
     * 获取网络请求数据
     */
    private void getSearch() {
        Runnable runnable =new Runnable() {
            @Override
            public void run() {
                HttpClient client =new HttpClient();
                Map<String,String>map= new HashMap<>();
                map.put("q","debate");
                map.put("tag","politics/politics");
                map.put("from-date","2014-01-01");
                map.put("api-key","test");
                final String response = client.creatConnection("search", map);

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (response ==null){
                            Toast.makeText(MainActivity.this, R.string.refresh_error, Toast.LENGTH_SHORT).show();
                            return;
                        }
                        Toast.makeText(MainActivity.this, R.string.refersh_success, Toast.LENGTH_SHORT).show();
                        ArrayList<ResultsBean> results= (ArrayList<ResultsBean>) JsonConversion.fromJson(response).getResults();
                        data.clear();
                        data.addAll(results);
                        adapter.notifyDataSetChanged();
                    }
                });
            }
        };
        new Thread(runnable).start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        getSearch();//refresh data
        Toast.makeText(this, R.string.refreshing, Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
}
