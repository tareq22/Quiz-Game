

package u.m.s;

import java.util.ArrayList;





public class Admin extends User{
    
    
    int no_of_user;
    public Admin(int id, String name, String gender ,int no_of_user) {
        super(id, name, gender);
        this.no_of_user = no_of_user;
        
    }
   
    
    public void check_name(ArrayList<Male_Staff>msl,ArrayList<Female_Staff>fesl,ArrayList<Teacher>tsl){
        for(Male_Staff ms:msl){
            if(ms.working_hours>=10){
                System.out.println("Staff Male");
                System.out.println(ms.getname());
                System.out.println("You Will get your bonus");
             
            }else{
                System.out.println(ms.getname());
                System.out.println("We are sorry you are not qualified for bonus");
            }
        }
            for(Female_Staff fes:fesl){
                if(fes.working_hours>=8){
                System.out.println("Staff Female");
                    System.out.println(fes.getname());
                    System.out.println("You Will get your Bonus");
                  
            }else{
                    System.out.println(fes.getname());
                    System.out.println("We are sorry you are not qualified for bonus");
                
                
                
            }
            
            
        }
            for(Teacher ts:tsl){
                if(ts.teaching_hrs>=10){
                    System.out.println(ts.getname());
                    System.out.println("Overtime not Required");
                    
                    
                }else{
                    System.out.println(ts.getname());
                    System.out.println("Overtime is required");
                    
                }
            }
        
    }
    
    
}
