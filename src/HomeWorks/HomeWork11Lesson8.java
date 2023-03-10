package HomeWorks;

import java.util.Arrays;
import java.util.Scanner;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

public class HomeWork11Lesson8 {
    public static void main(String[] args) {
//        Транспонуйте матрицю M x N. Розміри M та N задаються з консолі. Після введення повинні автоматично
//        створюватися два масиви розміром M x N перший та N x M другий.

        Scanner scanner = new Scanner(System.in);

        int n = -1;
        while (true) {
            System.out.println("Enter number N.");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data! Please enter integer.");
                scanner.nextLine();
            }
        }

        int m = -1;
        while (true) {
            System.out.println("Enter number M.");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data! Please enter integer.");
                scanner.nextLine();
            }
        }

        int[][] array1 = new int [n][m];
        int[][] array2 = new int [m][n];

        System.out.println("Before:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 11);
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = array1[j][i];
                }
            }

        System.out.println();
        System.out.println("After");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2.length; j++) {
                int temp = array2[i][j];
                array2[i][j] = array2[j][i];
                array2[j][i] = temp;
            }
        }

    }
}
