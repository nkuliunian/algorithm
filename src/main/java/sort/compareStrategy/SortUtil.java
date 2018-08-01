package sort.compareStrategy;

import java.util.Arrays;

public class SortUtil {
    public static <T> void swapTwoElement(T[] originArrays,int indexA,int indexB){
        if (indexA == indexB)
            return;
        T temp = originArrays[indexA];
        originArrays[indexA] = originArrays[indexB];
        originArrays[indexB] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArrays = {1,2,3};
        swapTwoElement(intArrays,0,2);
        System.out.println(Arrays.toString(intArrays));
    }
}
