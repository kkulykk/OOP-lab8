package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {
    Authorization authEng;
    Авторизація authUkr;
    БазаДаних db;

    @BeforeEach
    void setUp() {
        authUkr = new Авторизація();
        authEng = new Authorization(authUkr);
        db = new БазаДаних();
    }

    @Test
    void authorize() {
        assertEquals(authUkr.авторизуватися(db), authEng.authorize(db));
    }
}