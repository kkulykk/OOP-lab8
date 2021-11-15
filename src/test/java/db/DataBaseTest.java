package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    БазаДаних bdUkr;
    DataBase bdEng;

    @BeforeEach
    void setUp() {
        bdUkr = new БазаДаних();
        bdEng = new DataBase(bdUkr);
    }

    @Test
    void getUserData() {
        assertEquals(bdEng.getUserData(), bdUkr.отриматиДаніКористувача());
    }

    @Test
    void getStaticData() {
        assertEquals(bdEng.getStaticData(), bdUkr.отриматиСтатистичніДані());
    }
}