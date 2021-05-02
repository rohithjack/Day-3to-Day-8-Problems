
package com.Java;


 class EmpWageCal {

    public void company1() {
        int max = 1;
        int min = 0;
        int range = max - min + 1;

        // generate random number

        int rand = (int) (Math.random () * range) + min;  //UC1 -CHECK EMPLOYEE PRESENT OR ABSANT
        int rand1 = (int) (Math.random () * range) + min;
        switch (rand) {     // UC4--SOLVING USING SWITCH STATEMENT
            case 0:
                System.out.println ( "company1 Employee Absent " );


                break;
            case 1:
                if (rand1 != 0) {
                    System.out.println ( "Daily Wage  Employee of company1 " );  //UC2 -DAILY WAGE EMPLOYEE
                    int wagePerHour = 20;
                    int noofWorkingHoursPerDay = 8;
                    int workingDaysinMonth = 20;

                    int empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
                    System.out.println ( "Employee wage per day in company1 is $" + empSalaryperDay );
                    int monthlySalary = empSalaryperDay * workingDaysinMonth;  //UC5 AND UC6 --CALCULATING WAGES FOR
                    // MONTH
                    System.out.println ( "Employee wage per month in company1 is $" + monthlySalary );

                } else {
                    System.out.println ( "Part time Employee of company1 " );   ////UC3 -PART TIME EMPLOYEE
                    int wagePerHour = 8;
                    int noofWorkingHoursPerDay = 8;
                    int workingDaysinMonth = 20;

                    int empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
                    System.out.println ( "Employee wage per day is  in company1 $" + empSalaryperDay );
                    int monthlySalary = empSalaryperDay * workingDaysinMonth;
                    System.out.println ( "Employee wage per month is in company1 $" + monthlySalary );
                }

                break;


            default: //code to be executed if all cases are not matched

                System.out.println ( "Invalid " );

        }
    }

     public void company2() {
         int max = 1;
         int min = 0;
         int range = max - min + 1;

         // generate random number

         int rand = (int) (Math.random () * range) + min;  //UC1 -CHECK EMPLOYEE PRESENT OR ABSANT
         int rand1 = (int) (Math.random () * range) + min;
         switch (rand) {     // UC4--SOLVING USING SWITCH STATEMENT
             case 0:
                 System.out.println ( "company2 Employee Absent " );


                 break;
             case 1:
                 if (rand1 != 0) {
                     System.out.println ( "Daily Wage  Employee of company2 " );  //UC2 -DAILY WAGE EMPLOYEE
                     int wagePerHour = 20;
                     int noofWorkingHoursPerDay = 8;
                     int workingDaysinMonth = 20;

                     int empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
                     System.out.println ( "Employee wage per day in company2 is $" + empSalaryperDay );
                     int monthlySalary = empSalaryperDay * workingDaysinMonth;  //UC5 AND UC6 --CALCULATING WAGES FOR
                     // MONTH
                     System.out.println ( "Employee wage per month in company2 is $" + monthlySalary );

                 } else {
                     System.out.println ( "Part time Employee of company2 " );   ////UC3 -PART TIME EMPLOYEE
                     int wagePerHour = 8;
                     int noofWorkingHoursPerDay = 8;
                     int workingDaysinMonth = 20;

                     int empSalaryperDay = noofWorkingHoursPerDay * wagePerHour;
                     System.out.println ( "Employee wage per day is  in company2 $" + empSalaryperDay );
                     int monthlySalary = empSalaryperDay * workingDaysinMonth;
                     System.out.println ( "Employee wage per month is in company2 $" + monthlySalary );
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
        obj.company1 ();
        obj.company1 ();
        obj.company2 ();
        obj.company2 ();
        obj.company2 ();


    }
}
