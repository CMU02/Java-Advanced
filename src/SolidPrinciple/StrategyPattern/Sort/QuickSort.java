package SolidPrinciple.StrategyPattern.Sort;

public class QuickSort implements SortStrategy {
    @Override
    public void sort(int... arr) {
        System.out.println("Quick Sort");
    }
}
