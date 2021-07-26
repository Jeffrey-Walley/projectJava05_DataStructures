import java.util.*;

public class projectJava05_DataStructures {
    public static void main(String[] args) {
        long[] array = {1,5,6,5,4,1};

        double maximum = array[0];

        int index = 0;

        for (int i = 1; i < array.length; i++){

            if (array[ i ] > maximum) {

                maximum = array[ i ];

                index = i;

            }

        }

        System.out.println(index);

    }
}
