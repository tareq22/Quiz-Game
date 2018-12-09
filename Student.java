
package u.m.s;

public  class Student extends User implements Facility{
    
    double cgpa;
    
    
    public Student(int id, String name, String gender,double cgpa) {
        super(id, name, gender);
        this.cgpa = cgpa;
        
        
        
    }
    
    @Override
    public void holidays(){
        System.out.println("Total 15 days holiday in per semester");
    }

    @Override
    public void givesalary() {
       
    }

    
    
}
