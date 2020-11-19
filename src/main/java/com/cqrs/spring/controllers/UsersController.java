package com.cqrs.spring.controllers;

import com.cqrs.spring.commands.AddNewUserCommand;
import com.cqrs.spring.commands.UpdateUserCommand;
import com.cqrs.spring.models.User;
import com.cqrs.spring.queries.GetUserBydIdQuery;
import com.cqrs.spring.queries.GetUsersQuery;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @GetMapping
    public User[] GetUsers() {
        return new GetUsersQuery().Handle();
    }

    @GetMapping("/{id}")
    public User GetUserById(@PathVariable long id) {
        return new GetUserBydIdQuery(id).Handle();
    }

    @PostMapping("/add")
    public boolean AddNewUser(User user) {
        return new AddNewUserCommand(user).Handle();
    }

    @PutMapping("/update")
    public boolean UpdateUser(User user) {
        return new UpdateUserCommand(user).Handle();
    }

    @DeleteMapping("/delete")
    public boolean DeleteUser(User user) {
        return new AddNewUserCommand(user).Handle();
    }
}