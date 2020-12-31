package pl.blaj;

public final class InsertionSort {

  public static void sort(int arr[]) {
    var n = arr.length;

    for (var i = 1; i < n; ++i) {
      var key = arr[i];
      var j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }
}
