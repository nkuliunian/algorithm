package sort.compareStrategy;

public class IntegerCompare implements CompareStrategy {
//    @Override
//    public int compare(Integer a,Integer b) {
//        return a.compareTo(b);
//    }

    @Override
    public <T> int compare(T a, T b) throws Exception{
        if (a instanceof Integer){
            return ((Integer)a).compareTo((Integer) b);
        } else if (a instanceof Long) {
            ((Long) a).compareTo((Long) b);
        }
        return 0;
    }
}
