package com.heb.code2college;

public class userInfo {
    private String userName, passWord;
    private boolean isAdmin;

    userInfo(String uN, String pW, boolean A){
        isAdmin = A;
        userName = uN;
        passWord = pW;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }
}
