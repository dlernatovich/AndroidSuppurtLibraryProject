package artlite.com.androidsupportlibraryproject.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;

import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.artlite.library.compilation.utils.LibraryLogger;
import com.thirdparty.activeandroid.Model;
import com.thirdparty.messagebar.MessageBar;
import com.thirdparty.snackbar.SnackBar;

import java.util.List;

import artlite.com.androidsupportlibraryproject.R;
import artlite.com.androidsupportlibraryproject.enteties.User;
import artlite.com.androidsupportlibraryproject.helpers.DatabaseHelper;


public class MainActivity extends BaseLibraryActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setHeaderToUpperCase(getString(R.string.app_name));

        startAsyncTask();

        ((Button) findViewById(R.id.button)).setOnClickListener(this);
        ((Button) findViewById(R.id.button1)).setOnClickListener(this);
        ((Button) findViewById(R.id.button2)).setOnClickListener(this);
        ((Button) findViewById(R.id.button3)).setOnClickListener(this);
        ((Button) findViewById(R.id.button4)).setOnClickListener(this);
        ((Button) findViewById(R.id.button5)).setOnClickListener(this);
        ((Button) findViewById(R.id.button6)).setOnClickListener(this);

    }

    @Override
    protected void initialize() {

        User user = new User();
        user.setUserName("John");
        user.setUserSurname("Whell");
        user.setUserID(100);
        user.save();

        List<Model> models = DatabaseHelper.selectAll(User.class);
        LibraryLogger.error(models.toString());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPreExecute() {
        super.onPreExecute();
        showWaitingDialog();
    }

    @Override
    public void doInBackground() {
        super.doInBackground();
        initialize();
    }

    @Override
    public void onPostExecute() {
        super.onPostExecute();
        hideWaitingDialog();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button: {
                showMessageWithAction("Activity was created", "OK", new SnackBar.OnMessageClickListener() {
                    @Override
                    public void onMessageClick(Parcelable token) {

                    }
                });
                break;
            }
            case R.id.button1: {
                showMessage("Another way to create message");
                break;
            }

            case R.id.button2: {
                showToastWithAction("Message was clicked", "DONE", new MessageBar.OnMessageClickListener() {
                    @Override
                    public void onMessageClick(Parcelable token) {
                        showToast("Another message");
                    }
                });
                break;
            }
            case R.id.button3: {
                showToast("Another message");
                break;
            }
            case R.id.button4: {
                startActivity(new Intent(this, LineChartActivity.class));
                break;
            }

            case R.id.button5: {
                startActivity(new Intent(this, UIActivity.class));
                break;
            }
            case R.id.button6: {
                break;
            }
            default:
                break;
        }
    }
}
