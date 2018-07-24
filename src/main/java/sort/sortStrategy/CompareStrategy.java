package sort.sortStrategy;

public interface CompareStrategy {
    <T> int compare(T a,T b) throws Exception;
}
