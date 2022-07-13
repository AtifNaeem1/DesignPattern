package com.Composite;

public class Company
{
    public static void main (String[] args)
    {
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        Directory devDirectory = new Directory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        Designer man1 = new Designer(200, "Kushagra Garg", "Graphic Designer");
        Designer man2 = new Designer(201, "Vikram Sharma ", "UI/UX designer");

        Directory designerDirectory = new Directory();
        designerDirectory.addEmployee(man1);
        designerDirectory.addEmployee(man2);

        Directory directory = new Directory();
        directory.addEmployee(devDirectory);
        directory.addEmployee(designerDirectory );
        directory.showEmployeeDetails();
    }
}
