package com.juaracoding.oop;

public interface IPusing<T> {
    public void save(T t);
    public void edit(T t);
    public void delete(T t);
}