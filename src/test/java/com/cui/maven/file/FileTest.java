package com.cui.maven.file;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {

    @Test
    public void test() throws IOException {
        File file = new File("hello.txt");
        System.out.println(file.getAbsolutePath());

        System.out.println(file.exists());

        boolean newFile = file.createNewFile();

        FileInputStream fileInputStream = new FileInputStream(file);
        int read = fileInputStream.read();
        System.out.println(read);
        System.out.println(newFile);

//        boolean mkdir = file.mkdir();
//        System.out.println(mkdir);
//        System.out.println(file.exists());

        FileOutputStream fos = new FileOutputStream(file);

        File file1 = new File("D:\\app\\idea\\maven\\maven-project\\study");

        String[] list = file1.list();

//        for (String s : list) {
//            System.out.println(s);
//        }

        File[] files = file1.listFiles();

//        for (File f: files) {
//            System.out.println(f.getName());
//
//        }

        printFiles(new File("D:\\app\\idea\\maven\\maven-project\\study"));


    }

    public static void printFiles(File file){

        File[] files = file.listFiles();

        if (files != null){

            for (File f : files) {
                if (f.isFile()){
                    System.out.println(f);
                }else {
                    printFiles(f);
                }
            }
        }

    }
}
