package artlite.com.androidsupportlibraryproject.ui.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.artlite.library.compilation.utils.LibraryLogger;

import artlite.com.androidsupportlibraryproject.R;

public class LoginActivity extends BaseLibraryActivity {

    private static final int[] BUTTONS_IDS = new int[]{
            R.id.buttonLogin,
            R.id.buttonRegistration
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_login, BUTTONS_IDS);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(SampleActivity.class);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        LibraryLogger.error("OnClick");
        switch (v.getId()) {
            case R.id.buttonLogin: {
                break;
            }
            case R.id.buttonRegistration: {
                startActivity(RegistrationActivity.class);
                break;
            }
            default:
                break;
        }
        super.onClick(v);
    }
}
