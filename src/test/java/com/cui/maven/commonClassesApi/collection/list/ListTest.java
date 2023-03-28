package com.cui.maven.commonClassesApi.collection.list;

import org.junit.Test;

import java.util.ArrayList;
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
}
