package Sorting;

public interface SortAlgorithm <T extends Comparable>{
    void sortArray(T[] numbers);
    public String getName();
}
