

package u.m.s;



public class Female_Staff extends Staff{
  
    public Female_Staff(int id, String name, String gender, int working_hours, int salary) {
        super(id, name, gender, working_hours, salary);
    }
    
    
    
    
    
    @Override
    void giveSalary(double balance) {
        balance = balance - salary;
        System.out.println("Your salary is withDraw");
        System.out.println("Name:" + getname()+ "\nSalary:" + salary );
    }
   public void holidays(){
       System.out.println("110 days");
   }
   public void holyday(String type){
       if (type.equalsIgnoreCase("Maternity LEave")){
           System.out.println("3 months");
       }
       
     
   }
    }
    
    
    

