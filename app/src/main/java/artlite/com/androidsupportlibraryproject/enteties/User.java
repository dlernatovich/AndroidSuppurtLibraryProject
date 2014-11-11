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
    @Column(name = "userID")
    private int userID;
    @Column(name = "userPassword")
    private String userPassword;

    public User() {
        super();
    }

    public User(String userName, String userSurname, int userID, String userPassword) {
        super();
        this.userName = userName;
        this.userSurname = userSurname;
        this.userID = userID;
        this.userPassword = userPassword;
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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public static String getUserNameQuerry(String userName) {
        String result;
        result = "userName = ?";
        return result;
    }

    public static String getUserSurNameQuerry(String userSurName) {
        String result;
        result = "userSurname = ?";
        return result;
    }

    public static String getUserPasswordQuerry(String userPassword) {
        String result;
        result = "userPassword = ?";
        return result;
    }

    public static String getUserIDQuerry(int userID) {
        String result;
        result = "userID = ?";
        return result;
    }

    @Override
    public String toString() {
        return "User: {Username:" + getUserName() + ", userSurName: " + getUserSurname() + ", userID: " + getUserID() + " userPassword:" + getUserPassword() + "}";
    }

}
