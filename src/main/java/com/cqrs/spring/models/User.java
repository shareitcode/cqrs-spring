package com.cqrs.spring.models;

public final class User {
    public long id;
    public String lastName;
    public String firstName;

    public User(long id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}