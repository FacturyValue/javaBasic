package com.common.design.cglib;

/**
 * 基于cglib代理
 */
public class Target {
    public String execute(){
        String message ="-----------test-------------";
        System.out.println(message);
        return message;
    }
}
