package HomeWorks;

import java.util.Scanner;

public class HomeWork7Lesson6 {
    public static void main(String[] args) {

//    Зробити гру, в якій потрібно відгадати ціле число, яке "загадав" комп'ютер у діапазоні від 0 до 10
//    Користувач повинен мати можливість вгадувати в кілька спроб (мінімум 3).

        int computerNumber = (int)(Math.random() * 11);
        System.out.println("Computer number is: " + computerNumber);

        Scanner scanner = new Scanner(System.in);

        int userValue = -1;
        while (true) {
            System.out.println("Enter computers' number from 0 to 10. You have three attempts.");
            if (scanner.hasNextInt()) {
                userValue = scanner.nextInt();
                break;
            } else {
                System.out.println("Wrong data! Please enter integer.");
                scanner.nextLine();
            }

        }

        int i = 1;
        while (i < 3){
            if(computerNumber == userValue) {
                System.out.println("You WIN!");
                break;
            } else {
                System.out.println("Try again!");
                userValue = scanner.nextInt();
                i++;
            }
        }
        System.out.println("You lose...");
    }
}
