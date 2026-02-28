package restaurant.loginForm.Data;

public class data {

    private String username;
    private String email;
    private String password;

    public data(String username, String email, String password){
        this.username = "John";
        this.email = "google.com";
        this.password = "123";
    }

    public data(){

    }

    //Setter Method
    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    public void setPassword(String newPassword){
        this.password = newPassword;
    }

    //Getter Method
    public String getUsername(){
        return username;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String logData(){
        return username + email + password;
    }


}
