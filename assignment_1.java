package winsoftAss;

import java.util.Arrays;

/*Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
*/
public class assignment_1 {
    public static int[] modifyArr(int X[], int Y[]) {
        int zeroCount = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] == 0) {
                zeroCount++;
            }
        }
        int arr[] = new int[X.length + Y.length - zeroCount];
        int itr = 0;
        int itr2 = 0;
        for (int i = 0; i < X.length; i++) {
            if (X[i] == 0) {
                arr[itr2] = Y[itr];
                itr++;

            } else {
                arr[itr2] = X[i];
            }
            itr2++;
        }
        while (itr < Y.length) {
            arr[itr2] = Y[itr];
            itr++;
            itr2++;
        }
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int X[] = new int[] { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int Y[] = new int[] { 1, 8, 9, 10, 15 };
        X = modifyArr(X, Y);
        for (int i = 0; i < X.length; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();
    }
}