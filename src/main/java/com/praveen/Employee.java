package com.praveen;

public class Employee {
    public int some_constant;

    public int sum(int a ,int b){
        return (a+b);
    }
    public static void main(String[] args) {
        Employee e  = new Employee();
        int val = e.sum(3,4);
        System.out.println("This is a sample project 2" + val);
    }
}
