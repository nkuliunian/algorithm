package sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试排序类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class TestSort {


    Integer[] intArray = {2,4,9,1,0,3,5,8,6};

    /**
     * 测试冒泡排序
     */
    @Test
    public void testBubbleSort() {
        SortContext sortContext = new SortContext(new BubbleSort());
        sortContext.sort(intArray);
    }

    @Test
    public void testInsertionSort() {

        SortContext sortContext = new SortContext(new InsertionSort());
        sortContext.sort(intArray);
    }

    @Test
    public void testSelectionSort() {

        SortContext sortContext = new SortContext(new SelectionSort());
        sortContext.sort(intArray);
    }

    @Test
    public void testMergeSort() {

        SortContext sortContext = new SortContext(new MergeSort());
        sortContext.sort(intArray);
    }

    @Test
    public void testQuickSort() {

        SortContext sortContext = new SortContext(new QuickSort());
        sortContext.sort(intArray);
    }

    /**
     * 测试统计排序
     */
    @Test
    public void testCountSort() {
        SortContext sortContext = new SortContext(new CountSort());
        Integer[] intArray = new Integer[]{1,2,2,3,2,4,7,7,1};
        sortContext.sort(intArray);
    }
}
