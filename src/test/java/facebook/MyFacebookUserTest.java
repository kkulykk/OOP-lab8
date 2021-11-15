package facebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    FacebookUser fbusr;
    MyFacebookUser myfbusr;


    @BeforeEach
    void setUp() {
        fbusr = new FacebookUser("a@b.com", "Norway", new Date());
        myfbusr = new MyFacebookUser(fbusr);
    }

    @Test
    void getCountry() {
        assertEquals(fbusr.getUserCountry(), myfbusr.getCountry());
    }

    @Test
    void getLastActiveTime() {
        assertEquals(fbusr.getUserActiveTime(), myfbusr.getLastActiveTime());
    }

    @Test
    void getEmail() {
        assertEquals(fbusr.getEmail(), myfbusr.getEmail());
    }
}