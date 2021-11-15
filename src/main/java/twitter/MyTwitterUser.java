package twitter;

import sender.User;
import twitter.TwitterUser;

import java.util.Date;

public class MyTwitterUser extends TwitterUser implements User {

    private TwitterUser user;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.user = twitterUser;
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }

    @Override
    public String getEmail() {
        return user.getUserMail();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getLastActiveTime();
    }
}
