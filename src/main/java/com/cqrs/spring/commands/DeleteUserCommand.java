package com.cqrs.spring.commands;

public class DeleteUserCommand extends Command<Boolean> {

    private final long userIdToDelete;

    public DeleteUserCommand(long userIdToDelete) {
        this.userIdToDelete = userIdToDelete;
    }

    @Override
    public Boolean Handle() {
        return false;
    }
}
