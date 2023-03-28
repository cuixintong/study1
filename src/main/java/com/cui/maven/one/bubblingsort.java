package com.cui.maven.one;

public class bubblingsort {
        public static void main(String[] args) {
//        冒泡排序
            int[] a = {2, 3, 5, 1, 4, 6, 3, 9, 2, 6, 8, 8, 6, 2, 4};
            int k;
            boolean falg;

            for (int i = 0; i < a.length; i++) {

                falg = false;
                for (int j = a.length-1; j >i ; j--) {
                    if (a[j]<a[j-1]){
                        swap(a,j,j-1);
                        falg = true;
                    }
//                    System.out.println(j);
                }
//                System.out.println(i);
                if (falg == false){
                    break;
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+"\t");
            }
        }

        public static void swap(int[] a, int i , int j){

            int k;
            k = a[i];
            a[i] = a[j];
            a[j] = k;

        }

    }
