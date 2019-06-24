package com.example.enumDemo;

public class Test {

    public static void main(String[] args) {

//        System.out.println(ErrorCodes.KUBERNETES_CONN_ERROR.format("aaa"));
        System.out.println(new BizException(ErrorCodes.KUBERNETES_CONN_ERROR.format("aaa")).toString());

    }

}
