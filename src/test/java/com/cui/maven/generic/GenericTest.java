package com.cui.maven.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GenericTest {
    @Test
    public void test(){
        ArrayList<Integer> integers = new ArrayList<>();

//        boolean aa = integers.add("AA");
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

        Set<Map.Entry<String, Integer>> entries = stringIntegerHashMap.entrySet();
    }
}
