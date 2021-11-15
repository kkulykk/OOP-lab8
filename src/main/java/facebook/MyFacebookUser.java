package facebook;

import facebook.FacebookUser;
import sender.User;

import java.util.Date;

public class MyFacebookUser extends FacebookUser implements User {

    private final FacebookUser user;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.user = facebookUser;
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getUserActiveTime();
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }
}
