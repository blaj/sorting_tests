package pl.blaj;

import java.util.Arrays;

public class Main {

  private static final int NUMBERS_COUNT = 520000;
  private static final int MIN_RANGE = -9999999;
  private static final int MAX_RANGE = 9999999;

  public static void main(String[] args) {
    var main = new Main();

    main.randomData();
    main.sortData();
    main.invertSortData();
    main.addRandomNumbersToSort();
  }

  private void randomData() {
    var data = DataGenerator.getArrayWithRandomNumbers(NUMBERS_COUNT, MIN_RANGE, MAX_RANGE);
    var data2 = data.clone();
    var data3 = data.clone();

    Timer.start();
    SelectionSort.sort(data);
    Timer.end();
    System.out.print("Selection sort: ");
    Timer.printElapsedTime();

    Timer.start();
    InsertionSort.sort(data2);
    Timer.end();
    System.out.print("Insertion sort: ");
    Timer.printElapsedTime();

    Timer.start();
    MergeSort.sort(data3, data3.length);
    Timer.end();
    System.out.print("Merge sort: ");
    Timer.printElapsedTime();
  }

  private void sortData() {
    var data = DataGenerator.getArrayWithSortNumbers(NUMBERS_COUNT);
    var data2 = data.clone();
    var data3 = data.clone();

    Timer.start();
    SelectionSort.sort(data);
    Timer.end();
    System.out.print("Selection sort: ");
    Timer.printElapsedTime();

    Timer.start();
    InsertionSort.sort(data2);
    Timer.end();
    System.out.print("Insertion sort: ");
    Timer.printElapsedTime();

    Timer.start();
    MergeSort.sort(data3, data3.length);
    Timer.end();
    System.out.print("Merge sort: ");
    Timer.printElapsedTime();
  }

  private void invertSortData() {
    var data = DataGenerator.getArrayWithInvertSortNumbers(NUMBERS_COUNT);
    var data2 = data.clone();
    var data3 = data.clone();

    Timer.start();
    SelectionSort.sort(data);
    Timer.end();
    System.out.print("Selection sort: ");
    Timer.printElapsedTime();

    Timer.start();
    InsertionSort.sort(data2);
    Timer.end();
    System.out.print("Insertion sort: ");
    Timer.printElapsedTime();

    Timer.start();
    MergeSort.sort(data3, data3.length);
    Timer.end();
    System.out.print("Merge sort: ");
    Timer.printElapsedTime();
  }

  private void addRandomNumbersToSort() {
    var first = DataGenerator.getArrayWithSortNumbers(1000000);
    var second = DataGenerator.getArrayWithRandomNumbers(NUMBERS_COUNT, MIN_RANGE, MAX_RANGE);

    int[] data = Arrays.copyOf(first, first.length + second.length);
    System.arraycopy(second, 0, data, first.length, second.length);

    var data2 = data.clone();

    Timer.start();
    InsertionSort.sort(data);
    Timer.end();
    System.out.print("Insertion sort: ");
    Timer.printElapsedTime();

    Timer.start();
    MergeSort.sort(data2, data2.length);
    Timer.end();
    System.out.print("Merge sort: ");
    Timer.printElapsedTime();
  }

  private void printArray(int[] array) {
    for(var el : array) {
      System.out.println(el);
    }
  }
}
