package artlite.com.androidsupportlibraryproject.helpers;

import com.activeandroid.Model;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created on 10/31/14.
 */
public class DatabaseHelper {
    public static List<Model> selectAll(Class model) {
        Select select = new Select();
        List<Model> models = select.from(model).execute();
        return models;
    }

    public static void createTable(Class model) {
    }
}
