package com.ascend.wangfeng.news.util;

import com.ascend.wangfeng.news.bean.Response;
import com.ascend.wangfeng.news.bean.ResultsBean;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by fengye on 2017/7/10.
 * email 1040441325@qq.com
 */

public class JsonConversion {
    public static Response fromJson(String string) {
        Response response = new Response();
        try {
            JSONObject object = new JSONObject(string);
            JSONObject responseJson = object.getJSONObject("response");
            JSONArray arrays = responseJson.getJSONArray("results");
            ArrayList<ResultsBean> results = getResults(arrays);
            response.setResults(results);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static ArrayList<ResultsBean> getResults(JSONArray arrays) throws JSONException {
        ArrayList<ResultsBean> results = new ArrayList<>();
        for (int i = 0; i < arrays.length(); i++) {
            ResultsBean resultsBean = new ResultsBean();
            JSONObject o = (JSONObject) arrays.opt(i);
            resultsBean.setSectionName(o.getString("sectionName"));
            resultsBean.setWebPublicationDate(o.getString("webPublicationDate"));
            resultsBean.setWebTitle(o.getString("webTitle"));
            resultsBean.setWebUrl(o.getString("webUrl"));
            results.add(resultsBean);
        }
        return results;
    }
}
