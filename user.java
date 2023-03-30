public class user {
    public String userName;
    public String pasword;
    private String setuserName;
    private String setpasword;
    private String getUsername;
    private String getPasword;
    
    public user(String userName, String pasword){
        this.userName = userName;
        this.pasword = pasword;
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getSetuserName() {
        return setuserName;
    }

    public void setSetuserName(String setuserName) {
        this.setuserName = setuserName;
    }

    public String getSetpasword() {
        return setpasword;
    }

    public void setSetpasword(String setpasword) {
        this.setpasword = setpasword;
    }

    public String getGetUsername() {
        return getUsername;
    }

    public void setGetUsername(String getUsername) {
        this.getUsername = getUsername;
    }

    public String getGetPasword() {
        return getPasword;
    }

    public void setGetPasword(String getPasword) {
        this.getPasword = getPasword;
    }
  
}
