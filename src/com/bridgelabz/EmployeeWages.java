package com.bridgelabz;

public class EmployeeWages {

    static final int WAGE_PRE_HOUR = 20;

    static final int FULL_DAY_HOURS = 8;



    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Main Branch");
        int empPresent = (int)Math.floor(Math.random()*10)%2;
        int empWage = 0;

        if(empPresent == 1){
            System.out.println("Employee is Present");
            empWage = WAGE_PRE_HOUR * FULL_DAY_HOURS;
        }
        else {
            System.out.println("Employee is Absent");
        }
        System.out.println("EmployeeWage = " + empWage);
    }
}
