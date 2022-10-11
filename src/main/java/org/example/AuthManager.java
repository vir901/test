package org.example;

public class AuthManager {
    AuthProvider ap;
    AuthManager (AuthProvider ap){
        this.ap = ap;
    };

    public boolean sign(String email, String password){
        return this.ap.sign(email, password) != null;
    }
}
