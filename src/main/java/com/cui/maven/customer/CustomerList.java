package com.cui.maven.customer;

public class CustomerList {

    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        if (total < customers.length){
            customers[total] = customer;
            this.total ++ ;
            return true;
        }
        return false;
    }

    public boolean delCustomer(int index){
        if (index >=0 && index < total){
            for (int i = index+1; i < total; i++) {
                customers[index+1] = customers[index];
            }
            customers[--total] = null;
            return true;
        }
        return false;
    }

    public boolean replaceCustomer(int index, Customer cust){
        if (index >= 0 && index < total){
            customers[index] = cust;
            return true;
        }
        return false;
    }

    public Customer[] getAllCustomer(){
        Customer[] customers1 = new Customer[total];
        System.arraycopy(customers,0,customers1,0,total);
        return customers1;
    }

    public Customer getCustomer(int index){
        if (index >= 0 && index < total){
            return customers[index];
        }
        return null;
    }

    public int getTotal(){
        return total;
    }
}
