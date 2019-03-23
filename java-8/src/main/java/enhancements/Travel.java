package enhancements;

import java.util.*;

class Travel {
    public static void main(String[] args) {
        Locale i1 = Locale.getDefault();       // US
        Locale i2 = new Locale("it");          // Italy
        Locale i3 = new Locale("it", "CH");    // Switzerland
	Locale i4 = new Locale("es", "MX");    // Mexico
        System.out.println(i3.getDisplayCountry(i1));
        System.out.println(i1.getDisplayCountry(i4));
        System.out.println(i3.getDisplayCountry(i4));	
    }
}
