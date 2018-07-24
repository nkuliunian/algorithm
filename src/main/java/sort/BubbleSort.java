package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {

    void sort(Integer[] originArray){
        int len = originArray.length;
        for (int j=0;j<len-1;j++) {
            boolean breakFlag = true;
            for (int i = 0; i < len-j-1; i++) {
                System.out.println(i + "," + j);
                if (originArray[i].compareTo(originArray[i + 1]) > 0) {
                    int temp = originArray[i + 1];
                    originArray[i + 1] = originArray[i];
                    originArray[i] = temp;
                    printArrays(originArray);
                    breakFlag = false;
                }
            }
            if (breakFlag)
                break;
        }
    }

    public <T> void printArrays(T[] arrays) {
        Arrays.stream(arrays).forEach(n -> System.out.print(n));
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {2,4,9,1,0,3,5,8,6};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(intArray);
    }

}
