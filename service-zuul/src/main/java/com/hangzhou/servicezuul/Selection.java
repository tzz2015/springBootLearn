package com.hangzhou.servicezuul;

public class Selection {
   public static void main(String[] arg) {
      int[] sbb = new int[]{99, 34, 22, 63, 29, 52, 88, 11};
      selectionSort(sbb);
      for (int a : sbb) {
         System.out.print(a + "\t");
      }
   }

   /**
    * 选择排序排序
    *
    * @param list
    */
   public static void selectionSort(int[] list) {
      for (int i = list.length - 1; i > 0; i--) {
         int max_index = 0;
         for (int j = 0; j <= i; j++) {
            if (list[j] > list[max_index]) {
               max_index = j;
            }
         }
         int temp = list[i];
         list[i] = list[max_index];
         list[max_index] = temp;
      }
   }
}
