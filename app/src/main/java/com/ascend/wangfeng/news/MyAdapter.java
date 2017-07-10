package com.ascend.wangfeng.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ascend.wangfeng.news.bean.ResultsBean;

import java.util.ArrayList;

/**
 * Created by fengye on 2017/7/10.
 * email 1040441325@qq.com
 */

class MyAdapter extends BaseAdapter {
    private ArrayList<ResultsBean> data;
    private Context mContext;

    public MyAdapter(ArrayList<ResultsBean> data,Context context){
        this.data = data;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup group) {
        ResultsBean resultsBean= data.get(i);
        ViewHolder viewHolder;
        if (view!=null){
            viewHolder = (ViewHolder) view.getTag();
        }else {
            LayoutInflater inflater =LayoutInflater.from(mContext);
            view =inflater.inflate(R.layout.item_main,null);
            viewHolder =new ViewHolder(view);
            view.setTag(viewHolder);
        }
        viewHolder.sectionName.setText(resultsBean.getSectionName());
        viewHolder.webTitle.setText(resultsBean.getWebTitle());
        viewHolder.date.setText(resultsBean.getWebPublicationDate());
        return view;
    }
    class ViewHolder{
        TextView sectionName;
        TextView webTitle;
        TextView date;

        public ViewHolder(View view) {
            sectionName = (TextView) view.findViewById(R.id.section_name);
            webTitle = (TextView) view.findViewById(R.id.web_title);
            date = (TextView) view.findViewById(R.id.date);
        }
    }

}
