package u.m.s;

import java.util.ArrayList;

public class UniversityManagement {

    public static void main(String[] args) {

        ArrayList<Local_Student> lsl = new ArrayList<>();
        Local_Student ls1 = new Local_Student(1001, "Afnan", "male", 3.00);
        Local_Student ls2 = new Local_Student(1077, "Raian", "male", 2.00);
        lsl.add(ls1);
        lsl.add(ls2);
        ArrayList<Foreign_Student> fsl = new ArrayList<>();
        Foreign_Student fs1 = new Foreign_Student(2001, "Spencer", "Male", 2.50,7.0);
        Foreign_Student fs2 = new Foreign_Student(2011, "Hotchner", "Male", 3.50,6.0);
        fsl.add(fs1);
        fsl.add(fs2);

        Teacher t1 = new Teacher(2001, "sadat", "male", 8, "bsc", 0167);
        t1.check_name(lsl, fsl);

        ArrayList<Male_Staff> msl = new ArrayList();
        
        Male_Staff ms3 = new Male_Staff(802, "Sanjoy", "Male", 7, 10000);
        Male_Staff ms4 = new Male_Staff(806, "Dipu", "Male", 10, 9500);
        
        msl.add(ms3);
        msl.add(ms4);
        
        ArrayList<Female_Staff> fesl = new ArrayList();
        Female_Staff fes1 = new Female_Staff(123,"Onim","Female",8,7000);
        Female_Staff fes2 = new Female_Staff(189,"Tanima","Female",7,6700);
        
        fesl.add(fes1);
        fesl.add(fes2);
        
        ArrayList<Teacher> tsl = new ArrayList();
        
        Teacher  ts1 = new Teacher(2001, "Shahadat", "male", 8, "Bsc in CSE ", 0167);
        Teacher ts2 = new Teacher (2312, "Asiful","Male",6,"Msc in CSe",01716);
        tsl.add(ts1);
        tsl.add(ts2);        
        

        Admin a1 = new Admin(11, "Shovon", "Male", 43);
        a1.check_name(msl,fesl,tsl);
        

    }
}
