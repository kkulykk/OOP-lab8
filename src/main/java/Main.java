import analytics.ReportBuilder;
import db.Authorization;
import db.DataBase;
import db.Авторизація;
import db.БазаДаних;

public class Main {
    public static void main(String[] args) {
        БазаДаних бд = new БазаДаних();
        DataBase db = new DataBase(бд);
        Авторизація авторизація = new Авторизація();
        Authorization auth = new Authorization(авторизація);
        if (auth.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
