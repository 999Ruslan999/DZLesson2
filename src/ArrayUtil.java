import java.util.Arrays;

public class ArrayUtil {
    String[] arr = new String[]{"first", "second", "third", "fourth"};

   public static String[] reduceEvenElement(String[] arr) {
       String[] result = new String[arr.length / 2];
       for (int i = 0; i < arr.length; i+=2) {
           result[i/2] = arr[i];
       }
       return result;
   }

    @Override
    public String toString() {
        return "ArrayUtil{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
