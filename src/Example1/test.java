package Example1;

import java.util.Arrays;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Integer[] numbers = {1,23,56,87,-9,0,22,22,56,8,89,123,45,-98,-34,59};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return -o1.compareTo(o2);
            }
        });

        System.out.println(Arrays.toString(numbers));

    }
}
