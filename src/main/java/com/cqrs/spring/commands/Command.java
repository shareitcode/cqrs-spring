package com.cqrs.spring.commands;

public abstract class Command<TCommandResult> {
    public TCommandResult Handle() {
        return null;
    }
    public TCommandResult HandleAsync() {
        return null;
    }
}