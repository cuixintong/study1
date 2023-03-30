package com.cui.maven.commonClassesApi.stringmore;

@SuppressWarnings("removal")
public class StringBuilderTest {

    public static void main(String[] args) {
        /*
        * 如果需要频繁的添加修改字符串，就是用buffer（线程安全但慢）或builder（线程不安全但快），没有线程用buffer，有线程用builder
        * */

        StringBuilder sb1 = new StringBuilder();
        sb1 = sb1.append('1').append('a');
        System.out.println(sb1);

        String[] arr1 = null;
        Object[] o = null;

        o = arr1;

    }
}
