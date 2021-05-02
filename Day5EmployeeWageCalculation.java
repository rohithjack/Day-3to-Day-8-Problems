
package com.Java;


 class EmpWageCal {

    public void wage() {
        int max = 1;
        int min = 0;
        int range = max - min + 1;

        // generate random number

        int rand = (int) (Math.random () * range) + min;  //UC1 -CHECK EMPLOYEE PRESENT OR ABSANT
        int rand1 = (int) (Math.random () * range) + min;
        switch (rand) {     // UC4--SOLVING USING SWITCH STATEMENT
            case 0:
                System.out.println ( "Employee Absent " );


                break;
            case 1:
                if (rand1 != 0) {
                    System.out.println ( "Daily Wage  Employee " );  //UC2 -DAILY WAGE EMPLOYEE
                    int wagePerHour = 20;
                    int noofWorkingHoursPerDay = 8;
                    int workingDaysinMonth = 20;

                    int empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
                    System.out.println ( "Employee wage per day is $" + empSalaryperDay );
                    int monthlySalary = empSalaryperDay * workingDaysinMonth;  //UC5 AND UC6 --CALCULATING WAGES FOR
                    // MONTH
                    System.out.println ( "Employee wage per month is $" + monthlySalary );

                } else {
                    System.out.println ( "Part time Employee " );   ////UC3 -PART TIME EMPLOYEE
                    int wagePerHour = 8;
                    int noofWorkingHoursPerDay = 8;
                    int workingDaysinMonth = 20;

                    int empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
                    System.out.println ( "Employee wage per day is $" + empSalaryperDay );
                    int monthlySalary = empSalaryperDay * workingDaysinMonth;
                    System.out.println ( "Employee wage per month is $" + monthlySalary );
                }

                break;


            default: //code to be executed if all cases are not matched

                System.out.println ( "Invalid " );

        }
    }
}

public class EmpWage {

    public static void main(String args[])
    {
        EmpWageCal obj =new EmpWageCal ();
        obj.wage ();
        obj.wage ();
        obj.wage ();


    }
}
