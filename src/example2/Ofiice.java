package example2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ofiice {
    static String fileName = "properties.txt";
    static File file = new File(fileName);


    public static Property[] makeArray () throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        reader.nextLine();
        Property[] result = new Property[10];
        for (int i = 0; i < 10; i++) {
            String line = reader.nextLine();
            String[] words = line.split(";");
            String city = words[0];
            double price = Double.parseDouble(words[1]);
            double area = Double.parseDouble(words[2]);
            double pricePerMeter = price/area;
            result[i]= new Property(city,price,area);
            result[i].setPricePerMeter(pricePerMeter);
        }
        return result;
    }

    public static String toString (Property[] properties){
        StringBuilder build = new StringBuilder();
        for (Property property : properties) {
            build.append(property.toString());
        }
        return build.toString();
    }

//    private static double round (double x){
//        double y = x*100;
//        y = Math.round(y);
//        return y/100;
//    }

}
