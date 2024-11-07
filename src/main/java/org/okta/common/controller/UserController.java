package org.okta.common.controller;

import com.okta.server.model.User;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.okta.common.config.UserId;
import org.okta.common.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api")
@SecurityRequirement(name = "bearer")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/test")
    public String test() {
        userService.test();
        return "Hello World";
    }

    @GetMapping(value = "/users")
    public Object getAllUsers() throws Exception {
        return userService.getUsers();
    }

    @PostMapping(value = "/user")
    public Object addUser(@RequestBody User user) throws Exception {
        return userService.addUser(user);
    }

    @PostMapping(value = "/assign/app")
    public Object assignApp(@RequestBody UserId user) throws Exception {
        return userService.assignApp(null);
    }

//    @PostMapping(value = "/make/admin")
//    public Object makeAdmin(@RequestBody User user) throws Exception {
//        return userService.makeAdmin(user);
//    }

}
