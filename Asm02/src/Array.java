import java.text.DecimalFormat;
import java.util.Scanner;


public class Array {

    Scanner scanner = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("#.0");

//    Xuất giá trị các phần tử của mảng theo dạng '1.0 2.0 3.4 5.1'
    public static void outputArray(double[] arr) {
        for (double i: arr) {
            System.out.print(df.format(i) + " ");
        }
        System.out.println();
    }

//    Nhập số lượng phần tử của mảng và giá trị các phần tử của mảng
//    Check các lỗi có thể xảy ra khi input từ bàn phím
    public boolean inputArray() {
        FastScanner sc = new FastScanner(System.in);

        System.out.println("Choice 1: Manual Input");
        System.out.print("Please enter input number of elements: ");
        int n;
        do {
            try {
                n =(int) sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.print("Enter Error. Retype: ");
            }
        } while (true);

        boolean check = false;
        double[] arr = new double[n];
        int count = 0;
        System.out.print("Please enter input elements: ");
        do {
            if(count == 5) {
                return false;
            }
            String a = scanner.nextLine();
            String[] numbers = a.split(" ");
            if(numbers.length == n) {
                for(int i = 0; i < numbers.length; i++) {
                    try {
                        arr[i] = Double.parseDouble(numbers[i]);
                        check = true;
                    } catch (Exception e) {
                        System.out.print("Error. Please enter input elements: ");
                        check = false;
                        count++;
                        break;
                    }
                }
            } else {
                System.out.print("Error. Please enter input elements: ");
                count++;
            }
        } while (!check);
        BinaryService.writeFile("store//input.txt", arr);
        return true;
    }

}
