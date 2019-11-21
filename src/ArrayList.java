import java.util.Arrays;

public class ArrayList {
    public static String[] add(String[] arr, String newString) {
        int currentSize = arr.length;
        int newSize = currentSize + 1;
        String[] tempArray = new String[newSize];
        for (int i = 0; i < currentSize; i++) {
            tempArray[i] = arr[i];
        }
        tempArray[newSize - 1] = newString;
        return tempArray;
    }

    public static void main(String[] args) {
        String[] arr2 = {"Sabina", "Gunay", "Naila"};
        arr2 = add(arr2, "Emil");
        for (String element : arr2) {
            System.out.println(element);
        }
        arr2=removeMethod(arr2,2);
        System.out.println("Resultant Array: "
                + Arrays.toString(arr2));
    }

    public static String[] removeMethod(String[] arr,
                                        int index) {
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }
        String[] arr2 = new String[arr.length - 1];
        System.arraycopy(arr, 0, arr2, 0, index);
        System.arraycopy(arr, index + 1,
                arr2, index,
                arr.length - index - 1);
        return arr2;
    }
}
