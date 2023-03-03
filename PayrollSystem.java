import java.util.Scanner;

public  class PayrollSystem {

   public static void main(String[] args) {
   
      Scanner scnr = new Scanner (System.in);
      
      long empNum;
      String empName;
      double hourSal, weekTime, weekSal, overTime;
      double regPay, overtimePay, netPay;
      
      System.out.println("Please Enter Your Employee 5 Digit #:");
      empNum = scnr.nextLong();
      
      if (empNum == 10001) {
         empName = "Abraham";
      }
      
      else if (empNum == 10002) {
         empName = "Britney";
      }
      
      else if (empNum == 10003) {
         empName = "Calvin";
      }      
      
      else if (empNum == 10004) {
         empName = "Danny";
      }
      
      else {
         empName = "Unknown Employee";
      }
      
      System.out.println("Welcome " + empName + ". Please Enter hourly salary:");
      hourSal = scnr.nextDouble();
      
      System.out.println("Please Enter Weekly Time:");
      weekTime = scnr.nextDouble();
      
      if (weekTime < 100) {
         weekSal = weekTime;
         overTime = 0;
         regPay = hourSal * weekTime;
         overtimePay = 0;
         netPay = regPay;
      }
      
      else {
         weekSal = 200;
         overTime = weekTime - 40;
         regPay = hourSal * weekSal;
         overtimePay = hourSal * overTime;
         netPay = regPay + overtimePay;
      }
      
      System.out.println("====================");
      System.out.println("==========PAYROLL SYSTEM===========");
      System.out.println("====================");
      System.out.println("|| Employee Name: " + empName + " ||");
      System.out.println("|| Employee ID: " + empNum + " ||");
      System.out.printf("|| Hourly Salary:  %.2f ||\n", hourSal);
      System.out.println("|| Weekly Time: " + weekTime + " ||");
      System.out.printf("|| Regular Pay:  %.2f ||\n", regPay);
      System.out.printf("|| Overtime Pay:  %.2f ||\n",overtimePay);
      System.out.printf("|| Net Pay:  %.2f ||\n", netPay);
      System.out.println("====================");
      
      
   }
   
}