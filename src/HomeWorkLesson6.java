import java.util.Scanner;

public class HomeWorkLesson6 {
    public static void main(String[] args) {

        //_____ Input teamName1 and points to all players____

        Scanner inputTeamName1 = new Scanner(System.in);
        System.out.println("Введіть ім'я першої команди: ");
        String teamName1 = inputTeamName1.nextLine();

        Scanner numberOfPointsTeam1Player1 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 1 з команди " + teamName1 + ": ");
        int pointsTeam1Player1 = 1;

        if (numberOfPointsTeam1Player1.hasNextInt()) {
            pointsTeam1Player1 = numberOfPointsTeam1Player1.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam1Player2 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 2 з команди " + teamName1 + ": ");
        int pointsTeam1Player2 = 2;

        if (numberOfPointsTeam1Player2.hasNextInt()) {
            pointsTeam1Player2 = numberOfPointsTeam1Player2.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam1Player3 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 3 з команди " + teamName1 + ": ");
        int pointsTeam1Player3 = 3;

        if (numberOfPointsTeam1Player3.hasNextInt()) {
            pointsTeam1Player3 = numberOfPointsTeam1Player3.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam1Player4 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 4 з команди " + teamName1 + ": ");
        int pointsTeam1Player4 = 4;

        if (numberOfPointsTeam1Player4.hasNextInt()) {
            pointsTeam1Player4 = numberOfPointsTeam1Player4.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam1Player5 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 5 з команди " + teamName1 + ": ");
        int pointsTeam1Player5 = 5;

        if (numberOfPointsTeam1Player5.hasNextInt()) {
            pointsTeam1Player5 = numberOfPointsTeam1Player5.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        //_____ Input teamName2 and points to all players____

        Scanner inputTeamName2 = new Scanner(System.in);
        System.out.println("Введіть ім'я другої команди: ");
        String teamName2 = inputTeamName2.nextLine();

        Scanner numberOfPointsTeam2Player1 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 1 з команди " + teamName2 + ": ");
        int pointsTeam2Player1 = 1;

        if (numberOfPointsTeam2Player1.hasNextInt()) {
            pointsTeam2Player1 = numberOfPointsTeam2Player1.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam2Player2 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 2 з команди " + teamName2 + ": ");
        int pointsTeam2Player2 = 2;

        if (numberOfPointsTeam2Player2.hasNextInt()) {
            pointsTeam2Player2 = numberOfPointsTeam2Player2.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam2Player3 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 3 з команди " + teamName2 + ": ");
        int pointsTeam2Player3 = 3;

        if (numberOfPointsTeam2Player3.hasNextInt()) {
            pointsTeam2Player3 = numberOfPointsTeam2Player3.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam2Player4 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 4 з команди " + teamName2 + ": ");
        int pointsTeam2Player4 = 4;

        if (numberOfPointsTeam2Player4.hasNextInt()) {
            pointsTeam2Player4 = numberOfPointsTeam2Player4.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        Scanner numberOfPointsTeam2Player5 = new Scanner(System.in);
        System.out.println("Введіть кількість фрагів для гравця 5 з команди " + teamName2 + ": ");
        int pointsTeam2Player5 = 5;

        if (numberOfPointsTeam2Player5.hasNextInt()) {
            pointsTeam2Player5 = numberOfPointsTeam2Player5.nextInt();
        } else {
            System.out.println("Ви ввели літери замість цифр! Будь ласка, спробуйте ще раз");
            System.exit(0);
        }

        //_______ Count average of points for two teams_______

        int averageOfPointsTeam1 = (pointsTeam1Player1 + pointsTeam1Player2 + pointsTeam1Player3 + pointsTeam1Player4 +
                pointsTeam1Player5) / 5;
        int averageOfPointsTeam2 = (pointsTeam2Player1 + pointsTeam2Player2 + pointsTeam2Player3 + pointsTeam2Player4 +
                pointsTeam2Player5) / 5;

        //________ Output results to the console _________

        if(averageOfPointsTeam1 > averageOfPointsTeam2){
            System.out.println("Перемогла команда " + teamName1 + " набрала " + averageOfPointsTeam1 + " очків");
        } else if (averageOfPointsTeam1 < averageOfPointsTeam2){
            System.out.println("Перемогла команда " + teamName2 + " набрала " + averageOfPointsTeam1 + " очків");
        } else {
            System.out.println("Жодна команда не виграла, команда " + teamName1 + " набрала " + averageOfPointsTeam1 +
                    " очків та команда " + teamName2 + " набрала " + averageOfPointsTeam1 + " очків");
        }

        }
}
