package pl.blaj;

import java.util.Random;

public final class DataGenerator {

  public static int[] getArrayWithRandomNumbers(int numbersCount, int minRange, int maxRange) {
    if (numbersCount < 1) {
      throw new IllegalArgumentException("Minimalna ilość liczb nie może być mniejsza od 1!");
    }
    if (minRange > maxRange) {
      throw new IllegalArgumentException(
          "Minimalna wielkość tablicy nie może być większa od maksymalnej !");
    }
    int[] arrayWithNumbers = new int[numbersCount];
    for (var i = 0; i < numbersCount; i++) {
      var range = maxRange - minRange + 1;
      var random = new Random();
      arrayWithNumbers[i] = random.nextInt(range) + minRange;
    }
    return arrayWithNumbers;
  }

  public static int[] getArrayWithSortNumbers(int numbersCount) {
    int[] arrayWithNumbers = new int[numbersCount];

    for (var i = 0; i < numbersCount; i++) {
      arrayWithNumbers[i] = i;
    }

    return arrayWithNumbers;
  }

  public static int[] getArrayWithInvertSortNumbers(int numbersCount) {
    int[] arrayWithNumbers = new int[numbersCount];

    for (var i = numbersCount; i > 0; i--) {
      arrayWithNumbers[i - 1] = i;
    }

    return arrayWithNumbers;
  }
}
