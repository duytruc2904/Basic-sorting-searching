
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Array array = new Array();
        Search search = new Search();
        double[] a = null;

        int i;
        do {
            display();

            do {
                try {
                    Scanner sc = new Scanner(System.in);
                    i = sc.nextInt();
                    if (i<0 ||i>7) {
                        System.out.print("Nhập sai. Nhập lại: ");
                    }
                    break;
                } catch (Exception e) {
                    System.out.print("Nhập sai. Nhập lại: ");
                }
            } while (true);

            Scanner sc = new Scanner(System.in);
            switch (i) {
                case 1:
                    if(array.inputArray()) {
                        try {
                            a = BinaryService.readFile("store//input.txt");
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Enter the error many times. Exit");
                    }
                    break;
                case 2:
                    System.out.print("File input: ");
                    String fileName = sc.nextLine();
//                    String fileName = "store//input.txt";
                    try {
                        double[] b = BinaryService.readFile(fileName);
                        System.out.print("Input array: ");
                        Array.outputArray(b);
                    } catch (FileNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.println("Choice 3: Bubble sort");
                    if(a != null) {
                        double[] arrbubbleSort = new double[a.length];
                        System.arraycopy(a, 0, arrbubbleSort, 0, a.length);
                        Sort.bubbleSort(arrbubbleSort);
                    }


                    break;

                case 4:
                    System.out.println("Choice 4: Selection sort");
                    if(a != null) {
                        double[] arrSelectionSort = new double[a.length];
                        System.arraycopy(a, 0, arrSelectionSort, 0, a.length);
                        Sort.selectionSort(arrSelectionSort);
                    }

                    break;

                case 5:
                    System.out.println("Choice 5: Insertion sort");
                    if(a != null) {
                        double[] arrInsertionSort = new double[a.length];
                        System.arraycopy(a, 0, arrInsertionSort, 0, a.length);
                        Sort.insertionSort(arrInsertionSort);
                    }

                    break;

                case 6:
                    System.out.println("Choice 6: Linear Search");
                    System.out.print("Please enter searched input value: ");
                    double x = inputValue();
                    double[] arrLinearSearch = a;
                    if (arrLinearSearch != null) {
                        System.out.print("Larger position: ");
                        search.linearSearch(arrLinearSearch, x);
                    }

                    break;

                case 7:
                    System.out.println("Choice 7: Binary Search");
                    System.out.print("Please enter searched input value: ");
                    double y = inputValue();
                    if(a!= null) {
                        double[] arrBinarySearch = new double[a.length];
                        System.arraycopy(a, 0, arrBinarySearch, 0, a.length);
                        System.out.print("The right position: ");
                        search.binarySearch(arrBinarySearch, y);
                    }

                    break;

                case 0:
                    System.out.println("Thank!");
                    return;
            }
        } while (true);
    }

    private static void display() {
        System.out.println();
        System.out.println("+-------------Menu-------------+");
        System.out.println("|       1. Manual Input        |");
        System.out.println("|       2. File Input          |");
        System.out.println("|       3. Bubble sort         |");
        System.out.println("|       4. Selection sort      |");
        System.out.println("|       5. Insertion sort      |");
        System.out.println("|       6. Search > value      |");
        System.out.println("|       7. Search = value      |");
        System.out.println("|       0. Exit                |");
        System.out.println("+------------------------------+");

    }

    static double inputValue() {
        double x;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                x = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.print("Error. Please Enter value again: ");
            }
        } while (true);
        return x;
    }

}