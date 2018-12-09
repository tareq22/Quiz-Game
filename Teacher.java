


package u.m.s;

import java.util.ArrayList;



public class Teacher extends User{
    
    int teaching_hrs;
    String  degree;
    int contact_no;
    
    public Teacher(int id, String name, String gender,int teaching_hrs, String degree, int contact_no) {
        super(id, name, gender);
        this.teaching_hrs=teaching_hrs;
        this.degree = degree;
        this.contact_no =contact_no;
    }
     
    public void check_name(ArrayList<Local_Student>lsl,ArrayList<Foreign_Student>fsl){
        for (Local_Student ls:lsl){
            if(ls.cgpa > 2.5){
                System.out.println(ls.getname());
                System.out.println("Passed");
                System.out.println("\n");
            }
        }
        for(Foreign_Student fs:fsl){
            if(fs.cgpa > 3.0 || fs.ielts > 6.5){
                System.out.println(fs.getname());
                System.out.println("You can get Admission");
                System.out.println("\n");
            }
        }
    }


}
