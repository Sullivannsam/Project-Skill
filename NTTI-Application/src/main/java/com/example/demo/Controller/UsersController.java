package com.example.demo.Controller;

import com.example.demo.Model.Users;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UserService userService;

    @GetMapping("/api/v1/users/admin")
    public List<Users> getListUsers(){
        return userService.getListUsers();
    }

    @PostMapping("/api/v1/add/user/id/admin")
    public Users addUsers(@PathVariable Users  id){
        return  userService.addUsers(id);
    }

    @PutMapping("/api/v1/update/user/admin")
    public Users updateUser(@RequestParam  Users update){
        return userService.updateUsers(update);
    }

    @DeleteMapping("/api/v1/delete/user/admin")
    public void deleteUser(Users delete){
        userService.deleteUser(delete);
    }



}
