package com.cui.maven.wrappertest;

//装箱和拆箱
public class WrapperTest {

    public static void main(String[] args) {
        Integer integer = new Integer(1);//为了让基本数据类型具有引用数据类型的特征
        Float sfloat = new Float(2);

        System.out.println(integer.equals(new Integer(2)));

        System.out.println(integer*2 );

        Integer intege1r = 2;

        int a = 1;
        System.out.println(integer.equals(a));

        Integer integer1 = new Integer(2);
        int i = integer1 + 1;
    }
}
