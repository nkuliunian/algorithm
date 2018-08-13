package sort;

import java.util.Arrays;

/**
 * 统计排序
 * 适用于知道数据范围的整数排序，预先分配好固定范围数组，统计每一个数组中数值在待排数组中出现的频率，
 * 统计结束后也就知道了每一个数在“排序后”数组中的位置，
 * </br> 知道待排数组都是10以内的正整数，如：1，2，2，3，2，4，7，7，1。我们用一个长度为10的数组统计这个数组，得到
 * ｛0，2，5，6，7，7，7，9，9，9｝分别对应0~9这个数字
 * 知道1在数组中出现2次，则1在“排序后数组”中应该出现在（0，1）这两个索引位置，2在数组中也出现3次，所以2应该
 * 在（2，3，4）这三个索引上，刚好对应上面统计数组中的index=1，2的值减一。
 *</br> T()= O(n)
 */
public class CountSort implements SortAlgorithm{


    @Override
    public Integer[] sort(Integer[] originArray) {

        System.out.println("before sort: " + Arrays.toString(originArray));

        int[] countArray = new int[10];
        //count[] = {0,2,3,1,1,0,0,2,0,0}
        for (int i=0; i<originArray.length; i++) {
            countArray[originArray[i]] ++;
        }
        System.out.println("countArray = " + Arrays.toString(countArray));
        //更改一下统计值，使他对应排序后数组中每个值的位置。
        //count[] = {0,2,5,6,7,7,7,9,9,9}
        for (int i=1; i<countArray.length;i++) {
            countArray[i] += countArray[i-1];
        }
        System.out.println("countArray = " + Arrays.toString(countArray));
        Integer[] sortedArray = new Integer[originArray.length];
        for (int i=0; i<originArray.length; i++) {
            sortedArray[countArray[originArray[i]] -1] = originArray[i];
            countArray[originArray[i]] --;
        }
        System.out.println("sortedArray = " + Arrays.toString(sortedArray));

        return sortedArray;
    }
}
