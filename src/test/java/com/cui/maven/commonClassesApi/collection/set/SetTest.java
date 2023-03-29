package com.cui.maven.commonClassesApi.collection.set;

import com.cui.maven.commonClassesApi.collection.list.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetTest {

    @Test
    public void test(){

        HashSet set = new HashSet();//数组+单向链表+红黑树

        set.add("AA");
        set.add(123);
        set.add("bb");
        set.add(new Person());

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){
        HashSet set = new LinkedHashSet();//数组+单向链表+红黑树+双向链表（用来记录添加的先后顺序）

        set.add("AA");
        set.add(123);
        set.add("bb");
        set.add(new Person());

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
