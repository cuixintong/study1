package com.cui.maven.one;

import java.util.Arrays;

public class ArgsTest {

    public static void main(String[] args) {
        ArgsTest argsTest = new ArgsTest();

        argsTest.print(1,2,3);

        System.out.println(argsTest.strconcat("1","2"));

    }

    public void print(int ... nums){
        System.out.println(Arrays.toString(nums));
    }

    public String strconcat(String ... str){

        if (str.length != 0){

            String str1 = "";

            for (int i = 0; i < str.length; i++) {
                str1 = str[i]  + "@" + str1;
            }

            return str1;
        }

        return null;
    }


}
