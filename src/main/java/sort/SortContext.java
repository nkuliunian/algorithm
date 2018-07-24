package sort;

/**
 * 使用策略模式封装排序算法
 */
public class SortContext {
    private SortAlgorithm sortAlgorithm;

    public SortContext(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm=sortAlgorithm;
    }

    public void sort(Integer[] arrays){
        sortAlgorithm.sort(arrays);
    }
}
