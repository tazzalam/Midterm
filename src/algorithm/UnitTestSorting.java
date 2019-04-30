package algorithm;

import org.testng.Assert;
import java.util.Arrays;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.insertionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");

        int[] unSortedArrayBubble = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArrayBubble = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        //apply unsorted array to selectionSort.
        sort.bubbleSort(unSortedArrayBubble);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        Assert.assertEquals(sortedArrayBubble, unSortedArrayBubble, "Array is not Sorted");


        int[] unSortedArraySelection = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArraySelection = {0, 1, 2, 4, 5, 6, 9};
        sort.selectionSort(unSortedArraySelection);
        Assert.assertEquals(sortedArraySelection, unSortedArraySelection, "Array is not Sorted");



        int[] unSortedArrayMerge = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArrayMerge = {0, 1, 2, 4, 5, 6, 9};
        sort.mergeSort(unSortedArrayMerge,0,unSortedArrayMerge.length-1);
        Assert.assertEquals(sortedArrayMerge, unSortedArrayMerge, "Array is not Sorted");

        int[] unSortedArrayBucket = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArrayBucket = {0, 1, 2, 4, 5, 6, 9};
        sort.bucketSort(unSortedArrayBucket,9);
        Assert.assertEquals(sortedArrayBucket, unSortedArrayBucket, "Array is not Sorted");

    }


}
