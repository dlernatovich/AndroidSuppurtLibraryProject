package artlite.com.androidsupportlibraryproject;

import android.app.Activity;
import android.os.Bundle;

import com.activeandroid.Model;
import com.activeandroid.util.Log;

import java.util.List;

import artlite.com.androidsupportlibraryproject.enteties.User;
import artlite.com.androidsupportlibraryproject.helpers.DatabaseHelper;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.setUserName("John");
        user.setUserSurname("Whell");
        user.save();

        List<Model> models = DatabaseHelper.selectAll(User.class);
        Log.e("===>", "" + models.toString());
    }


}
