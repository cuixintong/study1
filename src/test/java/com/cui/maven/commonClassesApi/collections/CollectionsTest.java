package com.cui.maven.commonClassesApi.collections;

import org.junit.Test;

import java.util.*;

public class CollectionsTest {

    @Test
    public void test(){
        List<Integer> list = Arrays.asList(3, 2, 5, 7, 2, 7, 6, 9, 5, 4, 455);
        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -Integer.compare(o1,o2);
            }
        });

        System.out.println(list);

        int frequency = Collections.frequency(list, 7);
        System.out.println(frequency);

        List list1 = Arrays.asList(new Object[10]);

        List<Integer> list2 = Collections.unmodifiableList(list);//只能读不能写
        List<Integer> list3 = Collections.synchronizedList(list);//线程安全

    }
}
