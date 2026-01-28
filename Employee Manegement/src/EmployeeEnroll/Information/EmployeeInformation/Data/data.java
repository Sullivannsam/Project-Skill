package EmployeeEnroll.Information.EmployeeInformation.Data;

public class data {

    private String name;
    private String password;
    private String email;
    private int id;
    private short age;


    public data(String name, String password, String email, int id, short age){
        this.name = "Sullivann Sam";
        this.password = "Admin";
        this.email = "Admin@google.com";
        this.id = 1001;
        this.age = 20;
    }

    public data(){

    }

    //Setter Method
    public void setName(String newName){
        this.name = newName;
    }
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public void setId(int newId){
        this.id = newId;
    }
    public void setAge(short newAge){
        this.age = newAge;
    }
    //Getter Method
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public String getEmail(){
        return email;
    }
    public int getId(){
        return id;
    }
    public short getAge(){
        return age;
    }

}
