package com.cqrs.spring.commands;

import com.cqrs.spring.models.User;

public class AddNewUserCommand extends Command<Boolean> {

    private final User userToAdd;

    public AddNewUserCommand(User userToAdd) {
        this.userToAdd = userToAdd;
    }

    @Override
    public Boolean Handle() {
        return false;
    }
}