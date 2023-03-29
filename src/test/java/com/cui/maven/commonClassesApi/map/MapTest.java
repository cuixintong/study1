package com.cui.maven.commonClassesApi.map;

import org.junit.Test;

import java.util.*;

public class MapTest {

    @Test
    public void test(){
        HashMap hashMap = new HashMap();

        hashMap.put(null,null);

        hashMap.put("name","cuixintong");
        hashMap.put("age",12);
        hashMap.putAll(new HashMap());//把一个map放到另一个map中，相当于复制

        Object name = hashMap.get("name");
        System.out.println(name);

        System.out.println(hashMap.size());

        Set set = hashMap.keySet();
        for (Object o : set) {
            System.out.println(o);
        }

        Collection values = hashMap.values();
        Iterator iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Set set1 = hashMap.entrySet();
        for (Object o : set1) {
            System.out.println(o);
        }


        System.out.println(hashMap);
    }

    @Test
    public void test2(){
        Properties properties = new Properties();//键和值都是string，是hashtable的子类
    }


}
