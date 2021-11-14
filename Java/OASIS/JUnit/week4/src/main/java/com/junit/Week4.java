package com.junit;

public class Week4 {
  /** Find max of 2 integer number.*/
  public static int max2Int(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  /** Find min of array. */
  public static int minArray(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    return min;
  }

  /** Calculating BMI. */
  public static String calculateBMI(double weight, double height) {
    double bmi = (double) (Math.round((weight / Math.pow(height, 2)) * 10)) / 10;
    
    String result = "";
    if (bmi < 18.5) {
      result = "Thiếu cân";
    }
    if (18.5 <= bmi && bmi <= 22.9) {
      result = "Bình thường";
    }
    if (23 <= bmi && bmi <= 24.9) {
      result = "Thừa cân";
    }
    if (bmi >= 25) {
      result = "Béo phì";
    }

    return result;
  }
}