package com.ascend.wangfeng.news.bean;

import java.util.List;

/**
 * Created by fengye on 2017/7/7.
 * email 1040441325@qq.com
 */

public class Response {
    private List<ResultsBean> results;

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }
}
