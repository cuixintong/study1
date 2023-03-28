package com.cui.maven.exceptiontest;

public class Demo {
    public static void main(String[] args) {
        //编译时异常javac
        //运行时异常java
        System.out.println("异常");

        RuntimeException runtimeException = new RuntimeException();


        try {
            int[] a = {1,2,3,4};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            throw new RuntimeException(e);
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
