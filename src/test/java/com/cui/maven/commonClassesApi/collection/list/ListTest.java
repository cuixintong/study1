package com.cui.maven.commonClassesApi.collection.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

    @Test
    public void test(){

        System.out.println("录入学生信息");

        ArrayList<Person> arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("1.继续录入，3，结束录入");

            int i = scanner.nextInt();

            if (i == 1){
                System.out.print("请输入学生姓名：");
                String name = scanner.next();
                System.out.print("请输入学生年龄：");
                int age = scanner.nextInt();

                arrayList.add(new Person(name,age));
            }else break;

        }

        for (Person p : arrayList) {
            System.out.println(p);
        }

        scanner.close();


    }

    @Test
    public void test2(){

        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < 30; i++) {
            String c =(char) (Math.random() * (122 - 97 + 1) + 97) + "";
            arrayList.add(c);
        }

        System.out.println(arrayList);
        System.out.println();
    }

    public static void ArrayTest(List list,String s){
        int count = 0;
        for (Object s1 : list) {
            if (s1 == s) count++;
        }
    }
}
