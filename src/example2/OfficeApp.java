package example2;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class OfficeApp {
    public static void main(String[] args) throws FileNotFoundException {
        Property[] properties = Ofiice.makeArray();
        Arrays.sort(properties);
        System.out.println(Ofiice.toString(properties));
    }
}
