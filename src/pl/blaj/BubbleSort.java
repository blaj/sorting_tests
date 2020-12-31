package pl.blaj;

public final class BubbleSort {

  static void sort(int[] array) {
    var n = array.length;
    var temp = 0;

    for (var i = 0; i < n; i++) {
      for (var j = 1; j < (n - i); j++) {
        if (array[j - 1] > array[j]) {
          temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}
