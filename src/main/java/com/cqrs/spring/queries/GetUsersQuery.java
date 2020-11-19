package com.cqrs.spring.queries;

import com.cqrs.spring.models.User;

public final class GetUsersQuery extends Query<User[]> {

    private final User[] users;

    public GetUsersQuery() {
        this.users = new User[] {
                new User(1, "Mario", "BROS"),
                new User(2, "James", "BOND"),
                new User(3, "Clark", "KENT")
        };
    }

    @Override
    public User[] Handle() {
        return users;
    }
}
