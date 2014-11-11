package artlite.com.androidsupportlibraryproject.helpers;

import artlite.com.androidsupportlibraryproject.enteties.User;

/**
 * Created on 11/10/14.
 */
public class UserHelper {

    public static void createUser(String userName, String userSurName, String userPassword) {
        User user = new User();
        user.setUserSurname(userSurName);
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.save();
    }


}
