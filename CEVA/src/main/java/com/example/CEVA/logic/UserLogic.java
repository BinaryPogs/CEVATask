package com.example.CEVA.logic;

import com.example.CEVA.config.ConfigProperties;
import com.example.CEVA.model.User;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

@Service
public class UserLogic {
    private static ConfigProperties configProperties;
    private final String JSONSUFFIX = ".json";


    @Autowired
    public UserLogic(ConfigProperties configProperties) {
        this.configProperties = configProperties;
    }


    public JSONObject populateJsonObj(User user) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("ID", user.getID());
        jsonObject.put("UserID", user.getUserID());
        jsonObject.put("EmployeeID", user.getEmployeeID());
        jsonObject.put("SiteName",user.getSiteName());
        jsonObject.put("BusinessUnitName",user.getBusinessUnitName());
        jsonObject.put("AccountName", user.getAccountName());
        jsonObject.put("GroupName",user.getGroupName());
        jsonObject.put("CategoryName",user.getCategoryName());
        jsonObject.put("TypeName",user.getTypeName());
        jsonObject.put("Date",user.getDate());
        jsonObject.put("Duration",user.getDuration());
        jsonObject.put("isProcessed",user.getProcessed());
        return jsonObject;
    }

    public File createDirectory() throws IOException {
        String configFilePath = configProperties.getFilePath();
        File directory = new File(configFilePath);
        String fileName = LocalDateTime.now().toLocalDate() + JSONSUFFIX;
        if (! directory.exists()){
            directory.mkdirs();
        }
        File file = new File(configFilePath + fileName);

        return file;
    }

    public void writeToFile(FileWriter fw, JSONArray userList) {
        try {
            fw.write(userList.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
