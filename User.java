
package u.m.s;



public class User {
    
    private   int id;
    private  String name;
    private  String gender;
    
    User(int id,String name,String gender){
        this.id = id;
        this.name =name;
        this.gender=gender;
    
}
    int getid(){
        return id;
    }
    
    String getname(){
        return name;
    }
    
    String getgender(){
        return gender;
    }
    
    
    
}
