package sort;

import java.util.Arrays;

public class SelectionSort implements SortAlgorithm{

    @Override
    public Integer[] sort(Integer[] originArray) {

        int n= originArray.length;
        int optCount = 0;

        for (int i=0; i<n; i++) {
            int min = originArray[i];
            int minIndex = i;
            for (int j=i+1; j<n; j++){
                System.out.println(String.format("i=%s,j=%s", i,j));
                optCount++;
                if (min >originArray[j]) {
                    min = originArray[j];
                    minIndex = j;
                    System.out.println(String.format("min=%s,minIndex=%s", min,minIndex));
                }
            }
            //swap [i] and min
            int temp = originArray[i];
            originArray[i]= min;
            originArray[minIndex] = temp;
            System.out.println(Arrays.toString(originArray));
        }

        System.out.println("optCount =" + optCount);
        return originArray;
    }
}
