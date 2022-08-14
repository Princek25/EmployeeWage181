package com.bridgelabz;

public class EmployeeWages {

    static final int WAGE_PRE_HOUR = 20;
    static final int FULL_DAY_HOURS = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
    static final int TOTAL_WORKING_HOURS = 100;

    private final String COMPANY;
    private final int WAGE_PER_HOUR;
    private final int WORK_DAYS_PER_MONTH;
    private final int TOTAL_WORK_HOURS;

    EmployeeWages(String COMPANY, int WAGE_PER_HOUR, int WORKING_DAYS_PER_MONTH, int TOTAL_WORKING_HOURS){
        this.COMPANY = COMPANY;
        this.WAGE_PER_HOUR = WAGE_PER_HOUR;
        this.WORK_DAYS_PER_MONTH = WORKING_DAYS_PER_MONTH;
        this.TOTAL_WORK_HOURS = TOTAL_WORKING_HOURS;
    }


    static void calculateWages(){

        System.out.println("Welcome to Employee Wage Computation Program on Main Branch");
        int dayCount = 1;
        int workingHours = 0;
        int totalWage = 0;
        while (dayCount <= WORKING_DAYS_PER_MONTH && workingHours < TOTAL_WORKING_HOURS) {
            int empPresent = (int) Math.floor(Math.random() * 10) % 3;
            int empWage = 0;

            if (empPresent == IS_FULL_TIME) {
                System.out.println("Employee is Full Time");
                empWage = WAGE_PRE_HOUR * FULL_DAY_HOURS;
            } else if (empPresent == IS_PART_TIME) {
                System.out.println("Employee is Part Time");
                empWage = WAGE_PRE_HOUR * PART_TIME_HOUR;

            } else {
                System.out.println("Employee is Absent");
            }

            totalWage+=empWage;

            System.out.println("EmployeeWage for Day # " + dayCount + " => " +empWage);
            dayCount++;
        }
        System.out.println("Total Wage = " +totalWage);
        System.out.println("Total Working Hours = "+workingHours);
    }
    public static void main(String[] args){
        EmployeeWages vmart = new EmployeeWages("vmart", 20,40,200);
        vmart.calculateWages();

        EmployeeWages bigbazaar = new EmployeeWages("bigbazaar",20, 50, 160);
        bigbazaar.calculateWages();
    }

}
