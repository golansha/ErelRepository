package Sorting;

import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSortAlgorithm implements SortAlgorithm{
    public static void main(String[] args){
        Random random = new Random();
        SortAlgorithm[] algorithms = {new MergeSortAlgorithm(), new BubbleSort()};
        for (int arraySize = 10; arraySize<10000000; arraySize*=10) {
            for (SortAlgorithm algorithm:algorithms) {
                Comparable[] numbers = IntStream
                        .generate(() -> random.nextInt(10000000))
                        .boxed()
                        .limit(arraySize)
                        .toArray(Integer[]::new);
                long startTime = System.currentTimeMillis();
                algorithm.sortArray(numbers);
                long endTime = System.currentTimeMillis();
                System.out.println(algorithm.getName()+" took " + (endTime - startTime) / 1000.0 + " seconds to sort "+ arraySize +" elements");
                for (int i = 0; i < numbers.length - 1; i++) {
                    assert (numbers[i].compareTo(numbers[i + 1])<=0) : "Not sorted!";
                }
            }
        }
//        System.out.println(Arrays.toString(numbers));
    }

    @Override
    public void sortArray(Comparable[] numbers) {
        sortArray(numbers,0,numbers.length);

    }

    @Override
    public String getName() {
        return "MergeSort";
    }

    public void mergeArray(Comparable[] numbers, int from, int middle, int to){
        Comparable[] subArray = new Comparable[to-from];
        int indexFrom = from;
        int indexMiddle = middle;
        for (int i = 0;(i < subArray.length); i++){
            if (indexMiddle == to){
                subArray[i] = numbers[indexFrom];
                indexFrom++;
                continue;
            }
            if (indexFrom == middle){
                subArray[i] = numbers[indexMiddle];
                indexMiddle++;
                continue;
            }
            if (numbers[indexFrom].compareTo(numbers[indexMiddle])>0){
                subArray[i] = numbers[indexMiddle];
                indexMiddle++;
            }
            else{
                subArray[i] = numbers[indexFrom];
                indexFrom++;
            }
        }
        for (int i = 0; i < subArray.length; i++){
            numbers[i+from] = subArray[i];
        }
    }
    public void sortArray(Comparable[] numbers, int from, int to){
        if (to - from == 1){
            return;
        }
        int middle = (from + to) / 2;
        sortArray(numbers, from, middle);
        sortArray(numbers, middle, to);
        mergeArray(numbers, from, middle, to);
    }
}