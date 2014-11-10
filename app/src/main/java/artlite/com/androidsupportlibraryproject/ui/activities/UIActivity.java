package artlite.com.androidsupportlibraryproject.ui.activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;

import artlite.com.androidsupportlibraryproject.R;

public class UIActivity extends BaseLibraryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_ui_test);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pie_chart, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
