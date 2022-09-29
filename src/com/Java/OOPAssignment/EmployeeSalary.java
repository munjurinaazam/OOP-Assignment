package com.Java.OOPAssignment;

public class EmployeeSalary {
    public static void main(String[] args) {

        Basic b_salary=new Basic();
        double basic_tax= b_salary.salary()*2;
        double bonus_tax= Basic.Bonus()/2.5;
        double pro_tax=Basic.Provisional_Fund();
        System.out.println("Employee Name:"+" "+ b_salary.name+" " +"Designation:"+" "+ b_salary.Designation);
        System.out.println("Basic Salary From Company: "+" "+b_salary.salary()*2);
        System.out.println("Provisional fund value:"+" "+ Basic.Provisional_Fund());
        System.out.println("Bonus got:"+" "+ Basic.Bonus()/2.5);
        System.out.println("Total Salary with bonus shows:"+" "+((basic_tax-pro_tax)+bonus_tax));
        System.out.println("Total Monthly Salary:"+" "+((basic_tax-pro_tax)));

    }
}
