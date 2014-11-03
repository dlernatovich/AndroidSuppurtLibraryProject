package artlite.com.androidsupportlibraryproject;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import com.activeandroid.Model;
import com.activeandroid.util.Log;
import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.github.mrengineer13.snackbar.SnackBar;

import net.simonvt.messagebar.MessageBar;

import java.util.List;

import artlite.com.androidsupportlibraryproject.enteties.User;
import artlite.com.androidsupportlibraryproject.helpers.DatabaseHelper;


public class MainActivity extends BaseLibraryActivity implements View.OnClickListener {

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
        ((Button) findViewById(R.id.button)).setOnClickListener(this);
        ((Button) findViewById(R.id.button1)).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button: {
                showMessageWithAction("Activity was created", "OK", new SnackBar.OnMessageClickListener() {
                    @Override
                    public void onMessageClick(Parcelable token) {
                        showToastWithAction("Message was clicked", "DONE", new MessageBar.OnMessageClickListener() {
                            @Override
                            public void onMessageClick(Parcelable token) {
                                showToast("Another message");
                            }
                        });
                    }
                });
                break;
            }
            case R.id.button1: {
                showMessage("Another way to create message");
                break;
            }
            default:
                break;
        }
    }
}
