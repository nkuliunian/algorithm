package sort;

import sort.compareStrategy.SortUtil;

import java.util.Arrays;
import java.util.Random;

public class QuickSort implements SortAlgorithm {
    @Override
    public Integer[] sort(Integer[] originArray) {

        int n = originArray.length;

        if (n<=1) {
            return originArray;
        } else if (n==2) {
            if (originArray[0] > originArray[1]) {
                SortUtil.swapTwoElement(originArray, 0,1);
            }
            return originArray;
        }

        //由于快排最差情况复杂度为O(n^2)，所以为避免最差情况，随
        // 机选择数组中的某个元素与第一个元素作替换然后再进行递归
        Random random = new Random();
        int randomIndex = random.nextInt(n);
        SortUtil.swapTwoElement(originArray, 0, randomIndex);

        //以第一个元素为基准元素，从左向右找到第一个大于它的元素，从右向左找到第一个小于它的元素，两个元素进行位置交换
        int baseElement = originArray[0];
        int leftIndex = 1;
        int rightIndex = n-1;
        boolean hasBigger = false;
        boolean hasSmaller = false;
        while (leftIndex <= rightIndex){
            if (!hasBigger && originArray[leftIndex] > baseElement) {
                hasBigger = true;
            }
            if (!hasSmaller && originArray[rightIndex] <= baseElement){
                hasSmaller = true;
            }
            if (hasBigger && hasSmaller){
                SortUtil.swapTwoElement(originArray, leftIndex,rightIndex);
                hasBigger=false;
                hasSmaller=false;
            }
            if (!hasBigger) {
                leftIndex++;
            }
            if (!hasSmaller) {
                rightIndex --;
            }
        }
        SortUtil.swapTwoElement(originArray,0,leftIndex-1);

        Integer[] left = Arrays.copyOfRange(originArray,0,leftIndex-1);
        Integer[] right = Arrays.copyOfRange(originArray,leftIndex,n);

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        left = sort(left);
        right = sort(right);

        Integer[] sortedArray = new Integer[n];
        for (int i=0;i<left.length;i++) {
            sortedArray[i]=left[i];
        }
        sortedArray[leftIndex-1] = originArray[leftIndex-1];
        for (int i=0;i<right.length;i++) {
            sortedArray[leftIndex+i]=right[i];
        }

        System.out.println(Arrays.toString(sortedArray));
        return sortedArray;
    }

}
