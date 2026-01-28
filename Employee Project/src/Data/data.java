package Data;

public class data {
    private String name;
    private String email;
    private String password;
    private int age;
    private int id;



    public data(){

    }
    //Setter Method
    public void setName(String newName){
        this.name = newName;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setId(int newId){
        this.id = newId;
    }

    //Getter Method
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }




}
