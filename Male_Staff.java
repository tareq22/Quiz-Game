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
public class Male_Staff extends Staff implements Facility{
    
    public Male_Staff(int id, String name, String gender, int working_hours, int salary) {
        super(id, name, gender, working_hours, salary);
        
    }
    
   
    
    
    
    
    @Override
    void giveSalary(double balance) {
        balance = balance - salary;
        System.out.println("Your salary is withDraw");
        System.out.println("Name:" + getname()+ "\nSalary:" + salary );
    }

    @Override
    public void holidays() {
         System.out.println("90 days holiday in total per year");
    }

    @Override
    public void givesalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }

    
    

