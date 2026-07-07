package CUSTOMMERGESORT;
import java.util.Scanner;

public class CustomerOrders {
    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for (int i = 0; i < leftArr.length; i++)
            leftArr[i] = arr[left + i];

        for (int i = 0; i < rightArr.length; i++)
            rightArr[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {

            if (leftArr[i] <= rightArr[j])
                arr[k++] = leftArr[i++];
            else
                arr[k++] = rightArr[j++];
        }

        while (i < leftArr.length)
            arr[k++] = leftArr[i++];

        while (j < rightArr.length)
            arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] orders = new int[n];

        for (int i = 0; i < n; i++)
            orders[i] = sc.nextInt();

        mergeSort(orders, 0, n - 1);

        for (int value : orders)
            System.out.print(value + " ");
    }
}
