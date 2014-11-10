package artlite.com.androidsupportlibraryproject.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.thirdparty.messagebar.MessageBar;
import com.thirdparty.snackbar.SnackBar;

import artlite.com.androidsupportlibraryproject.R;


public class SampleActivity extends BaseLibraryActivity implements View.OnClickListener {

    private static final int[] BUTTON_IDS = new int[]{
            R.id.button,
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_main, BUTTON_IDS);
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
