package artlite.com.androidsupportlibraryproject.helpers;

import artlite.com.androidsupportlibraryproject.enteties.User;

/**
 * Created on 11/10/14.
 */
public class UserHelper {

    public static void createUser(int userID, String userSurName, String userName, String userPassword) {
        User user = new User();
        user.setUserID(userID);
        user.setUserSurname(userSurName);
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.save();
    }

    public static void createUser(String userSurName, String userName, String userPassword) {
        User user = new User();
        user.setUserSurname(userSurName);
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        user.save();
    }


}
