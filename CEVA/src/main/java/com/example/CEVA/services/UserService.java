package com.example.CEVA.services;

import com.example.CEVA.logic.UserLogic;
import com.example.CEVA.model.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@Service
public class UserService {
    private static UserLogic userLogic;

    @Autowired
    public UserService(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    public void uploadJSONObjectToFileSys(ArrayList<User> users) throws IOException, JSONException {
        File file = userLogic.createDirectory();
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        JSONArray userList = new JSONArray();
        for(User user: users){
           JSONObject jsonObject = userLogic.populateJsonObj(user);
           userList.put(jsonObject);
        }
        userLogic.writeToFile(fw,userList);
        fw.flush();
        fw.close();
    }
}
