package com.bridgelabz;

public class EmployeeWages {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program on Main Branch");
        int empPresent = (int)Math.floor(Math.random()*10)%2;
        System.out.println(empPresent);
        if(empPresent == 1){
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");

    }
}
