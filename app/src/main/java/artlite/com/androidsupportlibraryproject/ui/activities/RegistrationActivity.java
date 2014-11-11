package artlite.com.androidsupportlibraryproject.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.artlite.library.compilation.ui.activities.BaseLibraryActivity;
import com.thirdparty.activeandroid.Model;

import java.util.List;

import artlite.com.androidsupportlibraryproject.R;
import artlite.com.androidsupportlibraryproject.enteties.User;
import artlite.com.androidsupportlibraryproject.helpers.DatabaseHelper;
import artlite.com.androidsupportlibraryproject.helpers.UserHelper;
import butterknife.InjectView;

public class RegistrationActivity extends BaseLibraryActivity {

    private static final int[] BUTTON_IDS = new int[]{
            R.id.buttonDone
    };

    @InjectView(R.id.editUserName)
    EditText editUserName;
    @InjectView(R.id.editPassword)
    EditText editPassword;
    @InjectView(R.id.editRetypePassword)
    EditText editRetypePassword;
    @InjectView(R.id.editSurname)
    EditText editSurname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_registration, BUTTON_IDS);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonDone: {
                onRegistration();
                break;
            }
            default:
                break;
        }
    }

    private void onRegistration() {
        String name = getText(editUserName);
        String password = getText(editPassword);
        String passwordRetype = getText(editRetypePassword);
        String surName = getText(editSurname);

        if (isHasNullValue(name, password, passwordRetype, surName)) {
            showErrorMessage("Please fill all required fields!");
            return;
        }

        if (isAccountAlreadyCreated(name, password)) {
            showErrorMessage("Account already created!");
            return;
        }

        if (!password.equals(passwordRetype)) {
            showErrorMessage("Passwords do not match!");
            return;
        }

        UserHelper.createUser(name, surName, password);
        closeActivity();

        showMessage("Account was created");
    }

    private boolean isAccountAlreadyCreated(String name, String password) {
        String querryType = User.getUserNameQuerry(name);
        List<Model> models = DatabaseHelper.selectFrom(User.class, querryType, name);
        if (models.size() > 0) {
            return true;
        }
        return false;
    }

    private boolean isHasNullValue(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
