package com.ascend.wangfeng.news.bean;

import java.util.List;

/**
 * Created by fengye on 2017/7/7.
 * email 1040441325@qq.com
 */

public class Response {
        private String status;
        private String userTier;
        private int total;
        private int startIndex;
        private int pageSize;
        private int currentPage;
        private int pages;
        private String orderBy;
        private List<ResultsBean> results;


        public void setStatus(String status) {
            this.status = status;
        }


        public void setUserTier(String userTier) {
            this.userTier = userTier;
        }


        public void setTotal(int total) {
            this.total = total;
        }


        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }


        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }


        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }


        public void setPages(int pages) {
            this.pages = pages;
        }


        public void setOrderBy(String orderBy) {
            this.orderBy = orderBy;
        }

        public List<ResultsBean> getResults() {
            return results;
        }

        public void setResults(List<ResultsBean> results) {
            this.results = results;
        }



    }
