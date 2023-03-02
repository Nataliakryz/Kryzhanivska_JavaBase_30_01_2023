package HomeWorks;

import java.util.Arrays;

public class HomeWork10Lesson8 {

//    Зробити два масиви з 7 цифр, заповнених випадковими цифрами (від 0 до 9).
//    Перший масив - це числа, які загадані фірмою-організатором лотереї.
//    Другий масив - це числа, які вгадав гравець.
//    Після того, як обидва масиви заповнені цифрами, потрібно відсортувати їх за зростанням будь-яким способом.
//    У відсортованих масивах визначити кількість збігів, тобто чисел у двох масивах з однаковим індексом; Наприклад:
//    first[3] повинен дорівнювати second[3], як показано нижче.

//    Приклад виведення в консоль (збіглися 1й, 4й та 6й елементи):
//            [0, 1, 4, 5, 5, 8, 9]
//            [1, 1, 2, 3, 5, 6, 9]
//    Кількість збігів: 3


    public static void main(String[] args) {
        int countOfNumbers = 7;
        int[] array1 = new int[countOfNumbers];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 8);
        }

        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        int[] array2 = new int[countOfNumbers];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 8);
        }

        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }else {
                continue;
            }
        }
        System.out.println("Кількість збігів: " + count);
    }
}
