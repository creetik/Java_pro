public class Main {
    public static void main(String[] args) {
Employee employee = new Employee("John","Develop","gmail.com",994636272,32);
Employee first = new Employee("Virtor","Tester","gmail...",46277272,22);

    }
}
class Employee {
   private String fullName;
    private String position;
   private String email;
   private int tefone;
   private int age;

    public  Employee(String fullname, String position, String email, int tefone, int age) {
        this.fullName = fullname;
        this.position = position;
        this.email = email;
        this.tefone = tefone;
        this.age = age;

    }
public void setFullname(String fullname){
            this.fullName=fullname;
}
public String getFullname(){
        return fullName;
}
public void setPosition(String position){
        this.position=position;
}
public String getPosition(){
        return position;
}
public void setEmail (String email){
        this.email=email;
}
public String getEmail(){
        return email;
}
public void setTefone (int tefone){
        this.tefone=tefone;
}
public int getTefone(){
        return tefone;
}
public void setAge (int age){
        this.age=age;
}
public int getAge (){
        return age;
}
}
