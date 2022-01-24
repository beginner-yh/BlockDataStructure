package com.block.datastructure.sort;

import java.util.Arrays;

/**
 * 快排
 * https://blog.csdn.net/qq_36186690/article/details/82470451
 */
class QuickSort {

    private void quicksort(int[] numbers, int left, int right) {
        if (left >= right) {
            return;
        }
        //设置最左边的元素为基准
        int key = numbers[left];
        //数组中比key小的放在左边，比key大的放右边
        int i = left;
        int j = right;
        while (i < j) {
            while (numbers[j] >= key && i < j) {
                j--;
            }
            while (numbers[i] <= key && i < j) {
                i++;
            }
            if (i < j) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }
        numbers[left] = numbers[i];
        numbers[i] = key;
        quicksort(numbers, left, i - 1);
        quicksort(numbers, i + 1, right);
    }

    /**
     * 内部实现代码挺多的
     *
     * @param numbers
     */
    public void quickSystem(int[] numbers) {
        Arrays.sort(numbers);
    }

    public void quickSystem(int[] a, int left, int right) {
        for (int i = left, j = i; i < right; j = ++i) {
            int ai = a[i + 1];
            while (ai < a[j]) {
                a[j + 1] = a[j];
                if (j-- == left) {
                    break;
                }
            }
            a[j + 1] = ai;
        }
    }
}
