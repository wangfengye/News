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
    public static Response fromJson(String string){
        Response response =new Response();
        try {
            JSONObject object =new JSONObject(string);
            JSONObject responseJson = object.getJSONObject("response");
            response.setStatus(responseJson.getString("status"));
            response.setUserTier(responseJson.getString("userTier"));
            response.setTotal(responseJson.getInt("total" ));
            response.setStartIndex(responseJson.getInt("startIndex"));
            response.setPageSize(responseJson.getInt("pageSize"));
            response.setCurrentPage(responseJson.getInt("currentPage"));
            response.setPages(responseJson.getInt("pages"));
            response.setOrderBy(responseJson.getString("orderBy"));
            JSONArray arrays = responseJson.getJSONArray("results");
            ArrayList<ResultsBean> results=getResults(arrays);
            response.setResults(results);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static ArrayList<ResultsBean> getResults(JSONArray arrays) throws JSONException {
        ArrayList<ResultsBean> results =new ArrayList<>();
        for (int i = 0; i < arrays.length(); i++) {
            ResultsBean resultsBean = new ResultsBean();
            JSONObject o = (JSONObject) arrays.opt(i);
            resultsBean.setId(o.getString("id"));
            resultsBean.setType(o.getString("type"));
            resultsBean.setSectionId(o.getString("sectionId"));
            resultsBean.setSectionName(o.getString("sectionName"));
            resultsBean.setWebPublicationDate(o.getString("webPublicationDate"));
            resultsBean.setWebTitle(o.getString("webTitle"));
            resultsBean.setWebUrl(o.getString("webUrl"));
            resultsBean.setApiUrl(o.getString("apiUrl"));
            resultsBean.setIsHosted(o.getBoolean("isHosted"));
            results.add(resultsBean);
        }
        return results;
    }
}
