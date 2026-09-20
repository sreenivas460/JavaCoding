package com.start.coding.coding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("Started the Question1");
        int[] arr1 = {3, 5, 6, 9, 15};
        int[] arr2 = {4, 6, 7, 9, 10, 15};
        approach1(arr1, arr2);
        approach2(arr1, arr2);
        approach3(arr1, arr2);
        System.out.println("Completed the Question1");
    }

    public static void approach1(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));
    }

    public static void approach2(int[] arr1, int[] arr2) {
        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
        System.out.println(Arrays.toString(result));
    }

    public static void approach3(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) result[k++] = arr1[i++];
            else result[k++] = arr2[j++];
        }
        while (i < arr1.length) result[k++] = arr1[i++];
        while (j < arr2.length) result[k++] = arr2[j++];
        System.out.println(Arrays.toString(result));
    }

}
