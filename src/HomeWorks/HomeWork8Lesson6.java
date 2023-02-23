package HomeWorks;

public class HomeWork8Lesson6 {
    public static void main(String[] args) {

//    У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей
//    на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел. Напишіть функцію, яка виводить усі номери
//    таких шатлів.

        int counter = 0;
        int i = 1;

            for (; i >= counter; i++) {
                if (i / 100 == 4 || i / 100 == 9 || i % 100 == 4 || i % 100 == 9 ||
                        (i / 10) % 10 == 4 || (i / 10) % 10 == 9 || (i % 10) % 10 == 4 || (i % 10) % 10 == 9 ||
                        i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9) {
                    continue;
                }
                System.out.println("shuttle number = " + i);
                counter++;
                if (counter >= 100) {
                    break;
                }
            }
                System.out.println("count shuttle = " + counter);
            }
        }

