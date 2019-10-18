package sealoftime.lab2;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public abstract class MoveMessages extends ListResourceBundle {
    private static ResourceBundle bundle = getBundle("sealoftime.lab2.MoveMessages");

    public MoveMessages() {
    }

    public static String getStr(String str) {
        return bundle.getString(str);
    }

    public static Object getObj(String var0) {
        return bundle.getObject(var0);
    }
}
