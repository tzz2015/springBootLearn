package com.hangzhou.servicezuul;

public class Insertion {
   public static void main(String[] arg) {
      int[] sbb = new int[]{99, 34, 22, 63, 29, 52, 88, 11};
      insertionSort(sbb);
      for (int a : sbb) {
         System.out.print(a + "\t");
      }
   }

   /**
    * 插入排序
    *
    * @param list
    */
   public static void insertionSort(int[] list) {
      for (int i = 1; i < list.length; i++) {
         for (int j = i; j > 0; j--) {
            if (list[j] < list[j - 1]) {
               int temp = list[j];
               list[j] = list[j - 1];
               list[j - 1] = temp;
            }
         }
      }
   }
}
