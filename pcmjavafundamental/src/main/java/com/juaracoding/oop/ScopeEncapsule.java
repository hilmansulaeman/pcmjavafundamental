package com.juaracoding.oop;

public class ScopeEncapsule {
    private String nama;
    private String password;
    private String email;

    public ScopeEncapsule(String nama, String password, String email) {
        this.nama = nama;
        this.password = password;
        this.email = email;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

