package sort;


public class TestSort {

    public static void main(String[] args) {
        Integer[] intArray = {2,4,9,1,0,3,5,8,6};

        SortContext sortContext = new SortContext(new BubbleSort());
        sortContext.sort(intArray);
    }
}
