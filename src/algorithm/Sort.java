package algorithm;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        int n = list.length;
        for (int j = 1; j < n; j++) {
            int key = list[j];
            int i = j - 1;
            while ((i > -1) && (list[i] > key)) {
                list[i + 1] = list[i];
                i--;
            }
            list[i + 1] = key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int[] array) {
        int[] list = array;

        int n = list.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j - 1] > list[j]) {
                    //swap elements
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }

            }
        }
        return list;

    }

    void mergeSort(int arr[], int beg, int end) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public int[] merge(int[] array, int beg, int mid, int end) {
        int[] list = array;

        int l = mid - beg + 1;
        int r = end - mid;

        int LeftArray[] = new int[l];
        int RightArray[] = new int[r];

        for (int i = 0; i < l; ++i)
            LeftArray[i] = list[beg + i];

        for (int j = 0; j < r; ++j)
            RightArray[j] = list[mid + 1 + j];


        int i = 0, j = 0;
        int k = beg;
        while (i < l && j < r) {
            if (LeftArray[i] <= RightArray[j]) {
                list[k] = LeftArray[i];
                i++;
            } else {
                list[k] = RightArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            list[k] = LeftArray[i];
            i++;
            k++;
        }

        while (j < r) {
            list[k] = RightArray[j];
            j++;
            k++;
        }


        return list;
    }

    public int[] quickSort(int[] array, int low, int high) {
        int[] list = array;
        //implement here


        int pivot = list[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (list[j] <= pivot) {
                i++;


                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }


        int temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;


        return list;
    }


    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && arr[l] > arr[largest])
            largest = l;


        if (r < n && arr[r] > arr[largest])
            largest = r;


        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            heapify(arr, n, largest);
        }
    }


    public int[] heapSort(int[] array) {
        int[] list = array;

        int n = list.length;


        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(list, n, i);


        for (int i = n - 1; i >= 0; i--) {

            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;


            heapify(list, i, 0);

        }
        return list;
    }


    public int[] bucketSort(int[] array, int maxVal) {
        int[] list = array;
        //implement here
        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = 0;
        }

        for (int i = 0; i < list.length; i++) {
            bucket[list[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                list[outPos++] = i;
            }
        }


        return list;
    }

    public int[] shellSort(int[] array) {
        int[] list = array;
        //implement here

        int n = list.length;


        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i += 1) {
                int temp = list[i];
                int j;
                for (j = i; j >= gap && list[j - gap] > temp; j -= gap)
                    list[j] = list[j - gap];

                list[j] = temp;
            }

        }
        return list;
    }

}