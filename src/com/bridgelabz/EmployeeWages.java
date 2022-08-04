package com.bridgelabz;

public class EmployeeWages {

    static final int WAGE_PRE_HOUR = 20;

    static final int FULL_DAY_HOURS = 8;

    static final int PART_TIME_HOUR = 4;

    static final int IS_FULL_TIME = 2;

    static final int IS_PART_TIME = 1;



    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program on Main Branch");
        int empPresent = (int)Math.floor(Math.random()*10)%3;
        int empWage = 0;

        if(empPresent == IS_FULL_TIME){
            System.out.println("Employee is Full Time");
            empWage = WAGE_PRE_HOUR * FULL_DAY_HOURS;
        } else if (empPresent == PART_TIME_HOUR) {
            System.out.println("Employee is Part Time");
            empWage = WAGE_PRE_HOUR * PART_TIME_HOUR;
            
        } else {
            System.out.println("Employee is Absent");
        }
        System.out.println("EmployeeWage = " + empWage);
    }
}
