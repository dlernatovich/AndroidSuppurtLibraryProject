package artlite.com.androidsupportlibraryproject.enteties;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created on 10/31/14.
 */
@Table(name = "Users")
public class User extends Model {
    @Column(name = "userName")
    private String userName;
    @Column(name = "userSurname")
    private String userSurname;

    public User() {
        super();
    }

    public User(String userName, String userSurname) {
        super();
        this.userName = userName;
        this.userSurname = userSurname;
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
}
