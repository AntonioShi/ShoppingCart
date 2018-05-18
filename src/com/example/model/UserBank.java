package com.example.model;

public class UserBank {
    private static User[] users = {new User("u1", "u1"),
                                    new User("u2", "u2"),
                                    new User("u3", "u3")};

    public static String check(User user){
        if (user == null || user != null && user.getUserName() == null && user.getPassWard() == null){
            //未输入时不显示提示
            return "" ;
        }
        for (int i = 0; i < users.length; i++){
            if (users[i].getUserName().equals(user.getUserName()) &&
                    users[i].getPassWard().equals(user.getPassWard())){
                return "success" ;
            }
        }
        return "用户名或密码不对!";
    }
}
