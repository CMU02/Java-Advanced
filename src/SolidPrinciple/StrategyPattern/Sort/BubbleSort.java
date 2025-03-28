package SolidPrinciple.StrategyPattern.Sort;

public class BubbleSort implements SortStrategy {
    @Override
    public void sort(int... arr) {
        System.out.println("Bubble Sort");
    }
}
