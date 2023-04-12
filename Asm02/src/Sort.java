public class Sort {

    // BubbleSort
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    swap(arr, j, j + 1);
                }
            }
            Array.outputArray(arr);
        }
        BinaryService.writeFile("store//output1.txt", arr);
    }

//    SelectionSort
    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
            Array.outputArray(arr);
        }
        BinaryService.writeFile("store//output2.txt", arr);
    }

//    InsertSort
    public static void insertionSort(double[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            double key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            Array.outputArray(arr);
        }
        BinaryService.writeFile("store//output3.txt", arr);

    }

//    SelectionSort không xuất giá trị ra console
    public static void selectionSortNoSave(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
    }

    // Swap
    private static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
