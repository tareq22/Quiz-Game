

package u.m.s;



public class Foreign_Student extends Student {
    
     double ielts;
    public Foreign_Student(int id, String name, String gender, double cgpa,double ielts) {
        super(id, name, gender, cgpa);
        this.ielts=ielts;
    }
    
}
