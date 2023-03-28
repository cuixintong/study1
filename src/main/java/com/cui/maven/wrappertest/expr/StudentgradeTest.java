package com.cui.maven.wrappertest.expr;

import java.util.Scanner;
import java.util.Vector;

public class StudentgradeTest {
    public static void main(String[] args) {
        Vector<Integer> integers = new Vector<>();

        Scanner scanner = new Scanner(System.in);

        int maxi = 0;
        while (true){
            int i = scanner.nextInt();

            if (i<0) break;

            integers.addElement(i);

            if (maxi < i) {
                maxi = i;
            }
        }

    }
}
