package com.ascend.wangfeng.news;


import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

import com.ascend.wangfeng.news.bean.ResultsBean;
import com.ascend.wangfeng.news.util.HttpClient;
import com.ascend.wangfeng.news.util.JsonConversion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengye on 2017/7/10.
 * email 1040441325@qq.com
 */

public class ResultsLoader extends AsyncTaskLoader<ArrayList<ResultsBean>> {
    public ResultsLoader(Context context) {
        super(context);
    }

    @Override
    public ArrayList<ResultsBean> loadInBackground() {
        HttpClient client =new HttpClient();
        Map<String,String> map= new HashMap<>();
        map.put("q","debate");
        map.put("tag","politics/politics");
        map.put("from-date","2014-01-01");
        map.put("api-key","test");
        String response = client.creatConnection("search", map);
        if (response==null)return new ArrayList<ResultsBean>();
        ArrayList<ResultsBean> results= (ArrayList<ResultsBean>) JsonConversion.fromJson(response)
                .getResults();
        return results;
    }
}
