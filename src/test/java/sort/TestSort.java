package sort;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试排序类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class TestSort {

    /**
     * 测试冒泡排序
     */
    @Test
    public void testBubbleSort() {
        Integer[] intArray = {2,4,9,1,0,3,5,8,6};

        SortContext sortContext = new SortContext(new BubbleSort());
        sortContext.sort(intArray);
    }
}
