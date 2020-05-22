package Sorting;

public class BubbleSort implements SortAlgorithm{
    @Override
    public String getName() {
        return "BubbleSort";
    }

    @Override
    public void sortArray(Comparable[] numbers) {
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers.length-i-1; j++){
                if (numbers[j].compareTo(numbers[j+1])>0){
                    Comparable swap = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = swap;
                }
            }
        }
    }
}
