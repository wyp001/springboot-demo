package com.example;

import com.example.restTemplate.RequestObject;
import com.example.restTemplate.RestTemplateUtil;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class ResttemplateApplicationTests {

    @Test
    public void testJavaObj(){
        RequestObject res = new RequestObject();
        res.setAge(18);
        res.setName("小明");
        res.setAddress("aaa");
        RestTemplate restTemplate = RestTemplateUtil.getInstance("utf-8");
        String url = "http://localhost:8080/rest/object";
        String result = restTemplate.postForObject(url, res, String.class);
        System.out.println(result);
    }

    @Test
    public void testMap() {
        Map<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("age", 18);
        hashMap.put("name", "小芳");
        hashMap.put("address", "广东深圳");
        RestTemplate restTemplate = RestTemplateUtil.getInstance("utf-8");
        String url = "http://localhost:8080/rest/map";
        String result = restTemplate.postForObject(url, hashMap, String.class);
        System.out.println(result);
    }

    @Test
    public void testJson() {
        JSONObject json = new JSONObject();
        json.put("age", 18);
        json.put("name", "小芳");
        json.put("address", "广东深圳");
        RestTemplate restTemplate = RestTemplateUtil.getInstance("utf-8");
        String url = "http://localhost:8080/rest/json";
        String result = restTemplate.postForObject(url, json, String.class);
        System.out.println(result);
    }



}
