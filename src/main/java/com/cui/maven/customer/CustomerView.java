package com.cui.maven.customer;

public class CustomerView {

   CustomerList[] customerList = new CustomerList[10];

   public void enterMainMenu(){

       boolean isFlag = true;

       while (isFlag){
           System.out.println("1. 添加用户");
           System.out.println("2， 修改用户");
           System.out.println("3，删除用户");
           System.out.println("4，客户列表");
           System.out.println("5，推出\n");

           char key = CMUtility.readMenuSelection();

           switch (key){
               case '1':
                   addNewCustomer();
                   break;
               case '2':
                   modifyCustomer();
                   break;
               case '3':
                   deleteCustomer();
                   break;
               case '4':
                   listAllCustomer();
                   break;
               case '5':
                   isFlag = false;
                   break;
           }
       }

   }

   private void addNewCustomer(){

   }

   private void modifyCustomer(){

   }

   private void deleteCustomer(){

   }

   private void listAllCustomer(){

   }

    public static void main(String[] args) {
        CustomerView cv = new CustomerView();


    }


}
