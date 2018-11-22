package com.hangzhou.servicezuul;

import java.util.List;

/**
 * 冒泡算法
 */
public class Bubble {
   public static void main(String[] args) {
      int[] sbb = new int[]{99, 34, 22, 63, 29, 52, 88, 11};
      bubbleSort(sbb);
      for (int a : sbb) {
         System.out.print(a + "\t");
      }
   }

   public static void bubbleSort(int[] list) {
      // 冒泡算法总共进行n-1次排序
      for (int i = list.length - 1; i > 0; i--) {
         for (int j = 0; j < i; j++) {
            if (list[j] > list[j + 1]) {
               int temp = list[j];
               list[j] = list[j + 1];
               list[j + 1] = temp;
            }
         }
      }
   }
}
