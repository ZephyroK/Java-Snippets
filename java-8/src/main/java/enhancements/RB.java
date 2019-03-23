package enhancements;

import java.util.Locale;
import java.util.ResourceBundle;

public class RB {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        Locale myLocale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("myPropsRB", myLocale);
        System.out.println(rb.getString("k2"));
        System.out.println(rb.getLocale());
    }
}


