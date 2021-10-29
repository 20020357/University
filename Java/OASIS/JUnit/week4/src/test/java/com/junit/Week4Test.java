package com.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Week4Test {
  @Test
  public void testMax2Int1() {
    assertEquals(2, Week4.max2Int(1, 2));
  }

  @Test
  public void testMax2Int2() {
    assertEquals(-1, Week4.max2Int(-1, -2));
  }

  @Test
  public void testMax2Int3() {
    assertEquals(2, Week4.max2Int(-1, 2));
  }

  @Test
  public void testMax2Int4() {
    assertEquals(3, Week4.max2Int(3, -100));
  }

  @Test
  public void testMax2Int5() {
    assertEquals(200, Week4.max2Int(200, 200));
  }

  @Test
  public void testMinArray1() {
    int[] arr = {1, 2, 3, 4};
    assertEquals(1, Week4.minArray(arr));
  }

  @Test
  public void testMinArray2() {
    int[] arr = {-10, 2, 3, 4};
    assertEquals(-10, Week4.minArray(arr));
  }

  @Test
  public void testMinArray3() {
    int[] arr = {-1, -2, -3, -4};
    assertEquals(-4, Week4.minArray(arr));
  }

  @Test
  public void testMinArray4() {
    int[] arr = {-1, 2, -3, 4};
    assertEquals(-3, Week4.minArray(arr));
  }

  @Test
  public void testMinArray5() {
    int[] arr = {0, 2, 3, 4};
    assertEquals(0, Week4.minArray(arr));
  }

  @Test
  public void testCalculateBMI1() {
    assertEquals("Beo phi", Week4.calculateBMI(85, 1.76));
  }

  @Test
  public void testCalculateBMI2() {
    assertEquals("Thieu can", Week4.calculateBMI(53, 1.73));
  }

  @Test
  public void testCalculateBMI3() {
    assertEquals("Binh thuong", Week4.calculateBMI(55, 1.6));
  }

  @Test
  public void testCalculateBMI4() {
    assertEquals("Thua can", Week4.calculateBMI(73, 1.75));
  }

  @Test
  public void testCalculateBMI5() {
    assertEquals("Thieu can", Week4.calculateBMI(45, 1.63));
  }
}