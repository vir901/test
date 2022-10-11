package org.example;

import java.util.UUID;

import static org.example.RandomStrGenerator.usingRandomUUID;

class RandomStrGenerator {

    static String usingRandomUUID() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString().replaceAll("-", "").substring(0, 30);
    }
}
public interface AuthProvider {

    public String sign(String email, String password);
}

class FacebookAuthProviderImpl implements AuthProvider{

    @Override
    public String sign(String email, String password) {
        return "fb_" + usingRandomUUID();
    }
}

class GoogleAuthProviderImpl implements AuthProvider{

    @Override
    public String sign(String email, String password) {
        return "google_" + usingRandomUUID();
    }
}