package com.hangzhou.servicezuul;

/**
 * 二分查找又称折半查找，它是一种效率较高的查找方法。
 * 　　【二分查找要求】：1.必须采用顺序存储结构 2.必须按关键字大小有序排列。
 */
public class BinarySearch {
   public static void main(String[] arg) {
      int[] numberArray = new int[]{1, 3, 5, 7, 9, 11, 13};
      System.out.println(binarySearch(numberArray, 3, 0, numberArray.length - 1));
      System.out.println(binarySearch(numberArray, 11, 0, numberArray.length - 1));
      System.out.println(binarySearch(numberArray, 7, 0, numberArray.length - 1));
      System.out.println(binarySearch(numberArray, 6, 0, numberArray.length - 1));


   }

   /**
    * 递归二分查找算法
    * @return 索引
    */
   public static int binarySearch(int[] array, int searchData, int startIndex, int endIndex) {
      int midIndex = (startIndex + endIndex) / 2;
      // 查找的数据不存在
      if (searchData < array[startIndex] || searchData > array[endIndex] || startIndex > endIndex) {
         return -1;
      }
      // 查找的数据在后半部分
      if (searchData > array[midIndex]) {
         return binarySearch(array, searchData, midIndex + 1, endIndex);
         // 查找的数据在前半部分
      } else if (searchData < array[midIndex]) {
         return binarySearch(array, searchData, startIndex, midIndex - 1);
      } else {
         return midIndex;
      }
   }
}
