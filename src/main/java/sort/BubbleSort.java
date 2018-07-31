package sort;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort implements SortAlgorithm {

    @Override
    public Integer[] sort(Integer[] originArray){
        int len = originArray.length;
        int optCount=0;

        for (int j=0;j<len-1;j++) {
            boolean breakFlag = true;
            for (int i = 0; i < len-j-1; i++) {
                optCount++;
                System.out.println(i + "," + j);
                if (originArray[i].compareTo(originArray[i + 1]) > 0) {
                    int temp = originArray[i + 1];
                    originArray[i + 1] = originArray[i];
                    originArray[i] = temp;

                    System.out.println(Arrays.toString(originArray));
                    breakFlag = false;
                }
            }
            if (breakFlag)
                break;
        }
        System.out.println("optCount =" + optCount);
        return originArray;
    }



}
