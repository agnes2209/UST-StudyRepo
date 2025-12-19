package liveClassWorks;

public class Developer extends Employee {
    String programmingLanguage;


    public Developer(String name,int employeeID,double salary,String programmingLanguage)
    {
        super(name,employeeID,salary);
        this.programmingLanguage=programmingLanguage;

    }
    public void displayDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: "+ programmingLanguage);
    }
}
