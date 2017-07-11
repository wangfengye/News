package com.ascend.wangfeng.news.util;

import android.net.Uri;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/**
 * Created by fengye on 2017/7/10.
 * email 1040441325@qq.com
 */

public class HttpClient {
    private static final String BASE_URL="content.guardianapis.com";
    private static final String API_KEY="test";
    private HttpURLConnection connection =null;
    public String creatConnection(String urlString, Map<String,String> map){
        String responseBody = null;//响应体
        Uri.Builder urlFull =new Uri.Builder();
        urlFull.scheme("http")
                .authority(BASE_URL)
                .appendPath(urlString);

        for (Map.Entry<String, String> entry :
                map.entrySet()) {
           urlFull.appendQueryParameter(entry.getKey(),entry.getValue());
        }
        try {
            URL url = new URL(urlFull.build().toString());
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-type", "application/x-java-serialized-object");
            connection.connect();
            if (connection.getResponseCode()==200){
            InputStream in =connection.getInputStream();
            responseBody = getBytesByInputStram(in);}else {
                responseBody =null;
            }

        }  catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (connection!=null)connection.disconnect();
        }
        return responseBody;
    }

    private String getBytesByInputStram(InputStream in) {
        String result =null;
        BufferedInputStream bis =new BufferedInputStream(in);
        ByteArrayOutputStream baos =new ByteArrayOutputStream();
        BufferedOutputStream bos = new BufferedOutputStream(baos);
        byte[] buffer =new byte[1024*8];
        int length ;
        byte[] bytes;
        try {
            while( (length=bis.read(buffer))>0){
                bos.write(buffer,0,length);
            }
            bos.flush();
            bytes=baos.toByteArray();
            result =new String(bytes,"UTF-8");
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
