package Data.DataAdmin;

public class adminInfo {
    private String adminTypeName;
    private String adminTypePassword;

    //Set Admin Constructor
    public adminInfo(){

    }
    public String getName(){
        return this.adminTypeName = "admin";
    }
    public String getPassword(){
        return this.adminTypePassword = "admin";
    }

}
