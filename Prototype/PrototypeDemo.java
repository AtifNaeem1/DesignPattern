package com.Prototype;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PrototypeDemo{
    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Employee Id: ");
        int eid=Integer.parseInt(br.readLine());
        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String ename=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress=br.readLine();
        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary= Double.parseDouble(br.readLine());
        System.out.print("\n");

        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);

        System.out.println("Employee Record Created\n\nCloning the employee record\n\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();

        System.out.println("\n\n\n");
        System.out.println("Employee hashCode = " + System.identityHashCode(System.identityHashCode(e1)));
        System.out.println("Clone hashCode = " + System.identityHashCode(System.identityHashCode(e2)));
    }
}