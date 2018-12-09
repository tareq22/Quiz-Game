/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u.m.s;

/**
 *
 * @author Tareq
 */
public class Staff extends User {
        
 int working_hours;
  int salary;
   
    public Staff(int id, String name, String gender,int working_hours,int salary) {
        super(id, name, gender);
        this.working_hours = working_hours;
        this.salary = salary;
       
     
        
    }

    
    

    
    
    
     void giveSalary(double balance) {
        balance = balance - salary;
        System.out.println("Your salary is withDraw");
        System.out.println("Name:" + getname()+ "\nSalary:" + salary );
    }
    
    
    
}
