package twitter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    TwitterUser tusr;
    MyTwitterUser mytusr;

    @BeforeEach
    void setUp() {
        tusr = new TwitterUser("a@b.net","Norway", new Date());
        mytusr = new MyTwitterUser(tusr);
    }

    @Test
    void getCountry() {
        assertEquals(tusr.getCountry(), mytusr.getCountry());
    }

    @Test
    void getEmail() {
        assertEquals(tusr.getUserMail(), mytusr.getEmail());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(tusr.getLastActiveTime(), mytusr.getLastActiveTime());
    }
}