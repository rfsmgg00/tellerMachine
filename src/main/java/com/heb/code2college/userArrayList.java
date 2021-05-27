package com.heb.code2college;

import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONArray;

public class userArrayList {
    private ArrayList<userAccounts> registry = new ArrayList<userAccounts>();
    private JSONArray a = (JSONArray) parser
            .parse(new FileReader("C:\\Users\\c2cst\\IdeaProjects\\c2cInternProject\\src\\src\\tables\\money.json"));

    public ArrayList<userAccounts> getRegistry() {
        return registry;
    }

    userArrayList() {

        registry.add(new userAccounts("f", 999, 38, 98));
    }

    public userInfo findUserInfo(String UN){
        for(userAccounts acc: registry){
            if (acc.getAccName().equals())
        }
    }
}
