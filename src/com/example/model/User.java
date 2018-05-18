package com.example.model;
//每个购物帐号的属性
public class User {
    private String userName ;
    private String passWard ;
    private String checkResult ;

    public User(String userName, String passWard){
        this.userName = userName ;
        this.passWard = passWard ;
    }

    public String getCheckResult() {
        checkResult = UserBank.check(this) ;//???
        return checkResult;
    }

    public String getPassWard() {
        return passWard;
    }

    public void setPassWard(String passWard) {
        this.passWard = passWard;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
