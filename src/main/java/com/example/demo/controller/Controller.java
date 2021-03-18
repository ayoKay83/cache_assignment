package com.example.demo.controller;

import com.example.demo.service.Cache;
import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    Cache cache = new Cache();

    @GetMapping("/get-user-data")
    @ResponseBody
    public String getUserData(@RequestParam("id") Integer id) throws InterruptedException {
        String userData;
        if (cache.has(id)) {
            return cache.get(id);
        } else {
            User user = new User(id);
            userData = user.getDataSlow();
            cache.set(id, userData);
        }   return userData;
    }
}