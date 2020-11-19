package com.cqrs.spring.commands;

import com.cqrs.spring.models.User;

public class UpdateUserCommand extends Command<Boolean> {

    private final User userToUpdate;

    public UpdateUserCommand(User userToUpdate) {
        this.userToUpdate = userToUpdate;
    }

    @Override
    public Boolean Handle() {
        return false;
    }
}