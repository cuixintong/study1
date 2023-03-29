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

        System.out.println("===================================");

        Set set1 = hashMap.entrySet();
        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(o);
        }



        System.out.println(hashMap);
    }


    @Test
    public void test2(){
        TreeMap treeMap = new TreeMap();//根据键来排序

        treeMap.put("AA",12);
        treeMap.put("DD",14);
        treeMap.put("CC",12);
        treeMap.put("BB",11);

        System.out.println(treeMap);

    }

    @Test
    public void test3(){
        TreeMap treeMap = new TreeMap(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        treeMap.put(new Person("AA",12),12);
        treeMap.put(new Person("DD",11),12);
        treeMap.put(new Person("CC",13),12);
        treeMap.put(new Person("BB",10),12);

        System.out.println(treeMap);

    }
    @Test
    public void test4(){
        Properties properties = new Properties();//键和值都是string，是hashtable的子类
    }


}
