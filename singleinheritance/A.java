package singleinheritance;

import java.util.Scanner;

class A {
    int emp_id,emp_salary;
    String emp_name,emp_category;
    void data(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter employee id: ");
        emp_id=s.nextInt();
        System.out.print("Enter employee name: ");
        emp_name=s.next();
        System.out.print("Enter employee category: ");
        emp_category=s.next();
        System.out.print("Enter employee salary perday: ");
        emp_salary=s.nextInt();
        s.close();
    }
}
