package sort.compareStrategy;

public interface CompareStrategy {
    <T> int compare(T a,T b) throws Exception;
}
