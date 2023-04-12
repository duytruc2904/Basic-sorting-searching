import java.io.*;
import java.util.Scanner;

public class BinaryService {

//    Đọc file
//    Đọc các giá trị phần từ trong mảng vào file cách nhau bởi khoảng trắng
    public static double[] readFile(String fileName) throws FileNotFoundException{
        double[] arr;
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)))) {
            String line = scanner.nextLine();
            String[] values = line.split(" ");
            arr = new double[values.length];
            for (int i = 0; i < values.length; i++) {
                arr[i] = Double.parseDouble(values[i]);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File không tồn tại");
        }
        return arr;

    }

//    Ghi File
//    Ghi các giá trị phần từ trong mảng vào file cách nhau bởi khoảng trắng
    public  static void writeFile(String fileName, double[] arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (double i : arr) {
                writer.write(String.valueOf(i));
                writer.write(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  static void writeFile(String fileName, int[] arr) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i : arr) {
                writer.write(String.valueOf(i));
                writer.write(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}