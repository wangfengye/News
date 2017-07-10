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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getUserTier() {
            return userTier;
        }

        public void setUserTier(String userTier) {
            this.userTier = userTier;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getStartIndex() {
            return startIndex;
        }

        public void setStartIndex(int startIndex) {
            this.startIndex = startIndex;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public String getOrderBy() {
            return orderBy;
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

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", userTier='" + userTier + '\'' +
                ", total=" + total +
                ", startIndex=" + startIndex +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                ", pages=" + pages +
                ", orderBy='" + orderBy + '\'' +
                ", results=" + results +
                '}';
    }


    }
