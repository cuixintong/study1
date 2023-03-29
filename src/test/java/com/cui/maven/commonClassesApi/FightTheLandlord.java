package com.cui.maven.commonClassesApi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class FightTheLandlord {

    /**
     * 不排序版
     */
    @Test
    public void test(){

        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"方片♦","黑桃♠","红桃♥","梅花♣"};

        ArrayList poker = new ArrayList();

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < color.length; j++) {
                poker.add(color[j] + num[i]);
            }
        }

//        System.out.println(poker);

        poker.add("\uD83C\uDF1E");
        poker.add("\uD83C\uDF1B");

//        System.out.println(poker);

        Collections.shuffle(poker);

        ArrayList player1 = new ArrayList();
        ArrayList player2 = new ArrayList();
        ArrayList player3 = new ArrayList();
        ArrayList dipai = new ArrayList();

        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() -3){
                dipai.add(poker.get(i));
            }
            if (i % 3 == 1){
                player1.add(poker.get(i));
            }
            if (i % 3 == 2){
                player2.add(poker.get(i));
            }
            if (i % 3 == 0){
                player3.add(poker.get(i));
            }
        }


        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(dipai);
    }


    /**
    * 排序版
    * */
    @Test
    public void test2(){

        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"方片♦","黑桃♠","红桃♥","梅花♣"};

        HashMap poker = new HashMap();
        ArrayList list = new ArrayList();

        int index = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < color.length; j++) {
                poker.put(index,color[j] + num[i]);
                list.add(index);
                index++;
            }
        }

        poker.put(index,"\uD83C\uDF1B");
        list.add(index);
        index++;
        poker.put(index,"\uD83C\uDF1E");
        list.add(index);

        Collections.shuffle(list);

        TreeMap player1 = new TreeMap();
        TreeMap player2 = new TreeMap();
        TreeMap player3 = new TreeMap();
        TreeMap dipai = new TreeMap();

        for (int i = 0; i < list.size(); i++) {
            if (i >= list.size() - 3){
                dipai.put(list.get(i),poker.get(list.get(i)));
            }else if (i % 3 == 0){
                player1.put(list.get(i),poker.get(list.get(i)));
            }else if (i % 3 == 1){
                player2.put(list.get(i),poker.get(list.get(i)));
            }else if (i % 3 == 2){
                player3.put(list.get(i),poker.get(list.get(i)));
            }
        }

        System.out.println(player1.values());
        System.out.println(player2.values());
        System.out.println(player3.values());
        System.out.println(dipai.values());
    }
}
