package com.cqrs.spring.queries;

public abstract class Query<TResult> {
    public TResult Handle() {
        return null;
    }
    public TResult HandleAsync() {
        return null;
    }
}