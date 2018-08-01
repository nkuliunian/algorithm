package sort;

import java.util.Arrays;

public class MergeSort implements SortAlgorithm {
    @Override
    public Integer[] sort(Integer[] originArray) {
        int n = originArray.length;

        if (n > 2) {
            Integer[] left = Arrays.copyOfRange(originArray, 0, n / 2);
            Integer[] right = Arrays.copyOfRange(originArray, n / 2, n);
            Integer[] newLeft = sort(left);
            Integer[] newRight = sort(right);

            //merge two array
            Integer[] mergeArrayRst =  merge(newLeft,newRight);
            System.out.println(Arrays.toString(mergeArrayRst));
            return mergeArrayRst;
        } else if (n==2) {
            if (originArray[0] > originArray[1]) {
                int temp = originArray[0];
                originArray[0] = originArray[1];
                originArray[1] = temp;
            }
        }

        System.out.println(Arrays.toString(originArray));
        return originArray;
    }

    /**
     * 合并两个数组
     * @param left
     * @param right
     * @return
     */
    Integer[] merge(Integer[] left, Integer[] right) {
        int n = left.length+right.length;
        Integer[] mergeArrayRst = new Integer[n];
        int k = 0;
        int minLeftIndex = 0;
        int minRithtIndex = 0;
        for (int i=0; i<n; i++) {
            int minLeft = left[minLeftIndex];
            int minRight = right[minRithtIndex];
            if (minLeft > minRight) {
                mergeArrayRst[i] = minRight;
                minRithtIndex++;
                if (minRithtIndex == right.length) {
                    mergeArrayRst = copyArrayPart(left,mergeArrayRst,minLeftIndex,left.length-1,i+1);
                    break;
                }
            } else {
                mergeArrayRst[i] = minLeft;
                minLeftIndex++;
                if (minLeftIndex == left.length) {
                    mergeArrayRst = copyArrayPart(right,mergeArrayRst,minRithtIndex,right.length-1,i+1);
                    break;
                }
            }
        }
        return mergeArrayRst;
    }

    /**
     * 部分复制一个数组到另一个数组的指定位置
     * @param oldArray
     * @param newArray
     * @param oldStartIndex
     * @param oldEndIndex
     * @param newStartIndex
     * @return
     */
    Integer[] copyArrayPart(Integer[] oldArray, Integer[] newArray,
                            int oldStartIndex, int oldEndIndex,int newStartIndex){
        for (int j = oldStartIndex; j <= oldEndIndex; j++) {
            {
                newArray[newStartIndex] = oldArray[j];
                newStartIndex++;
            }
        }
        return newArray;
    }
}
