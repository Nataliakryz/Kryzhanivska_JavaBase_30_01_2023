import java.util.Scanner;

public class HomeWorkLesson5version2 {
    public static void main(String[] args) {

        System.out.println("Розрахунок загальної атаки армії Лі.");

        Scanner attackRateDynastyLIWarrior = new Scanner(System.in);
        System.out.println("Введіть показниками атаки воїна династії Лі: ");
        int dynastyLIWarrior = attackRateDynastyLIWarrior.nextInt();

        Scanner attackRateDynastyLIArcher = new Scanner(System.in);
        System.out.println("Введіть показниками атаки лучника династії Лі: ");
        int dynastyLIArcher = attackRateDynastyLIArcher.nextInt();

        Scanner attackRateDynastyLIRider = new Scanner(System.in);
        System.out.println("Введіть показниками атаки вершника династії Лі: ");
        int dynastyLIRider = attackRateDynastyLIRider.nextInt();

        Scanner warriorsDynastyLIWarriorsEveryType = new Scanner(System.in);
        System.out.println("Введіть кількість воїнів династії Лі кожного типу: ");
        int dynastyLIWarriorsEveryType = warriorsDynastyLIWarriorsEveryType.nextInt();

        double totalAttackRateDynastyLI = (dynastyLIWarrior + dynastyLIArcher + dynastyLIRider) * dynastyLIWarriorsEveryType;

        System.out.println("Значення загальної атаки династії Лі: " + totalAttackRateDynastyLI);
        System.out.println();

        System.out.println("Розрахунок загальної атаки армії Мінь.");

        Scanner attackRateDynastyMinWarrior = new Scanner(System.in);
        System.out.println("Введіть показниками атаки воїна династії Мінь: ");
        int dynastyMinWarrior = attackRateDynastyMinWarrior.nextInt();

        Scanner attackRateDynastyMinArcher = new Scanner(System.in);
        System.out.println("Введіть показниками атаки лучника династії Мінь: ");
        int dynastyMinArcher = attackRateDynastyMinArcher.nextInt();

        Scanner attackRateDynastyMinRider = new Scanner(System.in);
        System.out.println("Введіть показниками атаки вершника династії Мінь: ");
        int dynastyMinRider = attackRateDynastyMinRider.nextInt();

        double dynastyMinWarriorsEveryType = dynastyLIWarriorsEveryType * 1.5;

        double totalAttackRateDynastyMin = (dynastyMinWarrior + dynastyMinArcher + dynastyMinRider) * dynastyMinWarriorsEveryType;

        System.out.println("Значення загальної атаки династії Мінь: " + totalAttackRateDynastyMin);
    }
}
