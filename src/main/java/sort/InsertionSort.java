package sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertionSort implements SortAlgorithm{
    @Override
    public Integer[] sort(Integer[] originArray) {

        int n = originArray.length;
        int optCount= 0;

        for (int j=1; j<n; j++) {
            for (int k=j; k>0; k--) {
                optCount++;
                System.out.println(String.format("y=%s,k=%s", j,k));
                if (originArray[k] < originArray[k - 1]) {
                    //swap [k], [k-1]
                    int temp = originArray[k - 1];
                    originArray[k - 1] = originArray[k];
                    originArray[k] = temp;
                    System.out.println(Arrays.toString(originArray));
                }else {
                    break;
                }
            }
        }
        System.out.println("optCount =" + optCount);
        return originArray;
    }
}
