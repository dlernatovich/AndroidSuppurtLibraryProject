package artlite.com.androidsupportlibraryproject.enteties;

import com.thirdparty.activeandroid.Model;
import com.thirdparty.activeandroid.annotation.Column;
import com.thirdparty.activeandroid.annotation.Table;

/**
 * Created on 10/31/14.
 */
@Table(name = "Users")
public class User extends Model {
    @Column(name = "userName")
    private String userName;
    @Column(name = "userSurname")
    private String userSurname;
    @Column
    private int userID;

    public User() {
        super();
    }

    public User(String userName, String userSurname, int userID) {
        super();
        this.userName = userName;
        this.userSurname = userSurname;
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "User: {Username:" + getUserName() + ", userSurName: " + getUserSurname() + ", userID: " + getUserID() + "}";
    }
}
