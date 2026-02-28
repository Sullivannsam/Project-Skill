package Data;

public class data {
    private String name;
    private String email;
    private String password;
    private int age;
    private int id;

    //Multi Constructor
    //Employee Constructor
    public data(String username, String userPassword, int userId){
        this.name = "Sam";
        this.password = "google";
        this.id = 1000;

    }
    //Default Constructor
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

    //Setter Method User Login
    public void setLogUsername(String logUsername){
        this.name = logUsername;
    }
    public void setLogPassword(String logUserPassword){
        this.password = logUserPassword;
    }

    //Getter Method User Login
    public String getLogUsername(){
        return this.name;
    }
    public String getLogPassword(){
        return this.password;
    }
    //Display Employee an Account
    public void showDetail(){
        System.out.println("Your name is: " + name);
        System.out.println("Your Id is: " + id);
    }



}
