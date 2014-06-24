package com.test;

public class Mysort {

    public void sort(int[] targetArr) {// 小到大的排序

        int temp = 0;
        for (int i = 0; i < targetArr.length; i++) {
            for (int j = targetArr.length - 1; j > i; j--) {
                if (targetArr[j] < targetArr[j - 1]) {
                    // 方法一：
                    temp = targetArr[j];
                    targetArr[j] = targetArr[j - 1];
                    targetArr[j - 1] = temp;

                    /*
                     * //方法二: targetArr[i] = targetArr[i] + targetArr[j]; targetArr[j] = targetArr[i] - targetArr[j];
                     * targetArr[i] = targetArr[i] - targetArr[j];
                     */
                }

            }
        }
    }

    public void buffoser(int a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int ad = 0;
                    ad = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = ad;
                }
            }
        }
    }

    public static void main(String[] args) {
        Mysort sort = new Mysort();
        int[] arr = new int[] { 3, 22, 11, 5, 400, 99, 20, 567, 56 };
        sort.sort(arr);
        System.out.print("==========" + Math.random() * 10000000000L + "===================");
        sort.buffoser(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

}
