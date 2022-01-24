package com.zch.common.lang;

import lombok.Data;

/**
 * Created by Jimmy on 2022/1/24
 */
@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data){
        Result m = new Result();
        m.setCode(0);
        m.setMsg(null);
        m.setData(data);
        return m;
    }

     public static Result succ(String msg, Object data){
        Result m = new Result();
        m.setCode(0);
        m.setMsg(msg);
        m.setData(data);
        return m;
     }

    public static Result fail(String msg){
        Result m = new Result();
        m.setCode(-1);
        m.setMsg(msg);
        m.setData(null);
        return m;
    }

    public static Result fail(String msg, Object data){
        Result m = new Result();
        m.setCode(-1);
        m.setMsg(msg);
        m.setData(data);
        return m;
    }

    public static Result fail(int code, String msg, Object data){
        Result m = new Result();
        m.setCode(code);
        m.setMsg(msg);
        m.setData(data);
        return m;
    }
}
