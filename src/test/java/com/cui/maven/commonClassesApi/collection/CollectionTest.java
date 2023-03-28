package com.cui.maven.commonClassesApi.collection;

import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void test(){

        Collection coll = new ArrayList();

        coll.add("string");
        coll.add(123);
        coll.add(new Object());

        System.out.println(coll);

        Collection coll2 = new ArrayList();

        coll2.add(456);
        coll2.addAll(coll);

        System.out.println(coll2);
        System.out.println(coll2.size());
        System.out.println(coll2.isEmpty());
        System.out.println(coll2.contains("123"));

        coll.clear();
    }

    @Test
    public void test2(){


        Integer[] arr = {1, 2, 3};
        List<Integer> integers = Arrays.asList(arr);
        System.out.println(integers.size());//3
        System.out.println(integers);

        int[] arr1 = new int[]{1,2,3};
        List<int[]> ints = Arrays.asList(arr1);
        System.out.println(ints.size());//1,因为集合中只能存放引用类型，int数组是基本数据类型，不能存放，就把整个数组当成一个对象放进去了
        System.out.println(ints);

        Iterator<Integer> iterator = integers.iterator();
        System.out.println(iterator);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (int i:
             arr1) {
            System.out.println(i);
        }

        for (Object o : integers) {
            System.out.println(o);
        }
    }
}
