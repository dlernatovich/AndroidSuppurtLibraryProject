package artlite.com.androidsupportlibraryproject.helpers;


import com.thirdparty.activeandroid.Model;
import com.thirdparty.activeandroid.query.From;
import com.thirdparty.activeandroid.query.Select;

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

    public static List<Model> selectFrom(Class model, String paramType) {
        Select select = new Select();
        List<Model> models = select.from(model).where(paramType).execute();
        return models;
    }

    public static List<Model> selectFrom(Class model, String paramType, String paramValue) {
        From select = new Select().from(model).where(paramType, paramValue);
        List<Model> models = select.execute();
        return models;
    }
}
