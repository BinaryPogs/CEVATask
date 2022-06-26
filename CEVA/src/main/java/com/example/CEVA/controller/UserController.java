package com.example.CEVA.controller;

import com.example.CEVA.model.User;
import com.example.CEVA.services.UserService;
import org.json.JSONException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping (path="/users")
    public void createFile(@RequestBody ArrayList<User> users) throws JSONException, IOException {
        userService.uploadJSONObjectToFileSys(users);
    }

}
