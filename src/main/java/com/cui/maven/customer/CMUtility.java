package com.cui.maven.customer;

import java.util.Scanner;

public class CMUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection(){
        char c;
        for (; ; ) {
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5'){
                System.out.println("选择错误，请重新输入");
            }else break;

        }
        return c;
    }

    private static String readKeyBoard(int i, boolean b) {
        return scanner.nextLine();
    }
}
