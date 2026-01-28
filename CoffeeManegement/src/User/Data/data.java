package User.Data;

public class data {
    private String name;
    private short age;
    private short year;
    private String email;
    private int phoneNumber;
    private String password;

    //Constructor and Multi Constructor
    //General Default Account (Register)
    public data(){
        this.name = name;
        this.age = age;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    //Java Initialize Constructor
    public data(String name, short age, short year, String email,String password, int phoneNumber){
        this.name = "Sam";
        this.age = 20;
        this.year = 2006;
        this.email = "Sam@goole.com";
        this.phoneNumber = 1234567;
        this.password = "google12";
    }

    //Setter Method
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(short newAge){
        this.age = newAge;
    }
    public void setYear(short newYear){
        this.year = newYear;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public void setPhoneNumber(int newPhoneNumber){
        this.phoneNumber = newPhoneNumber;
    }
    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    //Getter Method
    public String getName(){
        return name;
    }
    public short getAge(){
        return age;
    }
    public int getYear(){
        return year;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }

}
