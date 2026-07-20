package singleinheritance;

 class B extends A {
    int month_salary,year_salary;
    void calculate(){
        month_salary=30*emp_salary;
        year_salary=12*month_salary;
    }
    void display(){
        System.out.println("Employee salary calculations here ... ");
    System.out.println("Employee id : "+emp_id);
    System.out.println("Employee name : "+emp_name);
    System.out.println("Employee category : "+emp_category);
    System.out.println("Employee salary perday : "+emp_salary);
    System.out.println("Employee month salary : "+month_salary);
    System.out.println("Employee year salary : "+year_salary);
    
    }
    
}
