package artlite.com.androidsupportlibraryproject.main;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.app.Application;

/**
 * Created on 10/30/14.
 */
public class CurrentApplication extends Application {

    private static CurrentApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        ActiveAndroid.initialize(this);
    }
}
