package com.ascend.wangfeng.news.bean;

/**
 * Created by fengye on 2017/7/10.
 * email 1040441325@qq.com
 */

public class ResultsBean {
    private String sectionName;
    private String webPublicationDate;
    private String webTitle;
    private String webUrl;

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public void setWebPublicationDate(String webPublicationDate) {
        this.webPublicationDate = webPublicationDate;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public void setWebTitle(String webTitle) {
        this.webTitle = webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }
}
