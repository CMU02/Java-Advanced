package SolidPrinciple.StrategyPattern.Sort;

public class Sorter {
    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int ...arr) {
        sortStrategy.sort(arr);
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8};

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();

        Sorter sorter1 = new Sorter(bubbleSort);
        Sorter sorter2 = new Sorter(quickSort);

        sorter1.sort(arr);
        sorter2.sort(arr);
    }
}
