package db;

public class DataBase extends БазаДаних {

    public БазаДаних db;

    public DataBase (БазаДаних db) {
        this.db = db;
    }

    public String getUserData() {
        return db.отриматиДаніКористувача();
    }

    public String getStaticData() {
        return db.отриматиСтатистичніДані();
    }
}

