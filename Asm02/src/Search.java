import java.util.ArrayList;
import java.util.List;

public class Search {
//    Tìm kiếm tuần tự các vị trí khi value nhỏ hơn các giá trị trong mảng
    public void linearSearch(double[] arr, double x) {
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                System.out.print(i + " ");
                a.add(i);
            }
        }
        System.out.println();
        int[] db = new int[a.size()];
        for(int i = 0; i < a.size(); i++) {
            db[i] = a.get(i);
        }
        BinaryService.writeFile("store//output4.txt", db);
    }

//    Tìm kiếm nhị phân vị trí phần tử đầu tiên có giá trị bằng value
    public void binarySearch(double[] arr, double x) {
        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        Sort.selectionSortNoSave(arr);
        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == x) {
                index = mid;
                right = mid - 1;
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(index != -1) {
            System.out.println(index);
        } else {
            System.out.println("No equal to " + x);
        }
        int[] db = {index};
        BinaryService.writeFile("store//output5.txt", db);
    }
}
