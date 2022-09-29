package com.Java.OOPAssignment;

public class Salary {
    public static void main(String[] args) {
        Salary s=new Salary();
        s.Employee_Salary(1000,300,200);
    }
    public void Employee_Salary(int basicsalary, int hra, int bonus){
        int netSalary= basicsalary+hra+bonus;
        System.out.println("Total Salary:"+netSalary);
    }
}
