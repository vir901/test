package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class AuthManagerTest {

    private String fb_ret = "fb_qwertyuiopasdfghjklzxcvbnm1234";

    private AuthManager authManager;
    @Mock
    private AuthProvider facebookAuthProviderMock;

    @BeforeEach
    void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAuthManagerNotNull(){
        authManager = new AuthManager(facebookAuthProviderMock);

        String email = "test@test.com";
        String password = "test";

        when(facebookAuthProviderMock.sign(email, password)).thenReturn(fb_ret);

        assertTrue(authManager.sign(email, password));

        String expected = facebookAuthProviderMock.sign(email, password);
        assertTrue(expected.matches("^fb_[a-zA-Z0-9]{30}"));
        assertEquals(expected, fb_ret);
    }

    @Test
    public void testAuthManagerNull(){
        authManager = new AuthManager(facebookAuthProviderMock);

        String email = "test@test.com";
//        String password = "test";

        when(facebookAuthProviderMock.sign(email, null)).thenReturn(null);

        assertFalse(authManager.sign(email, null));

    }

}
