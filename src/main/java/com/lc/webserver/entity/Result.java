package com.lc.webserver.entity;

import java.util.HashMap;
import java.util.Map;

public class Result {

    private int code;
    private String msg;
    private Map<String,Object> data = new HashMap<>();

    public static Result success() {
        Result result = new Result();
        result.setCode(1);
        result.setMsg("处理成功");
        return result;

    }

    public static Result fail() {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("处理失败");
        return result;

    }

    public Result add(String key,Object value) {
        this.data.put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }

}
