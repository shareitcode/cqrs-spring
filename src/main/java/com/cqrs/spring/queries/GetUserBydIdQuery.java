package com.cqrs.spring.queries;

import com.cqrs.spring.models.User;

import java.util.Arrays;

public class GetUserBydIdQuery extends Query<User> {

    private final long userId;

    public GetUserBydIdQuery(long userId) {
        this.userId = userId;
    }

    @Override
    public User Handle() {
        User[] users = new User[] {
                new User(1, "Mario", "BROS"),
                new User(2, "James", "BOND"),
                new User(3, "Clark", "KENT")
        };
        return Arrays.stream(users).filter(user -> user.id == this.userId).findFirst().orElse(new User(0, "", ""));
    }
}
