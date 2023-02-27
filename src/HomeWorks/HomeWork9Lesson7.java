package HomeWorks;

public class HomeWork9Lesson7 {
    public static void main(String[] args) {

//        Є дві команди регбі з 25 гравців різного віку у кожній.
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//        Виведіть у двох рядках вік гравців кожної команди.
//        Порахуйте середній вік гравців кожної команди та виведіть на екран.

        int numberMembersOfTeam = 25;

        System.out.println("Команда перша: ");
        int[] array1 = new int[numberMembersOfTeam];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int sum1 = array1[0];
        for (int i = 1; i < array1.length; i++) {
            sum1 += array1[i];
        }

        System.out.println("Середній вік: " + sum1 / numberMembersOfTeam);

        System.out.println();
        System.out.println("Команда друга: ");
        int[] array2 = new int[numberMembersOfTeam];

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);
            System.out.print(array2[i] + " ");
        }

        int sum2 = array2[0];
        for (int i = 1; i < array2.length; i++) {
            sum2 += array2[i];
        }
        System.out.println();
        System.out.println("Середній вік: " + sum2 / numberMembersOfTeam);

    }
}
