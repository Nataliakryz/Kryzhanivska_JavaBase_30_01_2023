package HomeWorks;

public class HomeWorkLesson5version1 {
    public static void main(String[] args) {

        int dynastyLIWarrior = 13;
        int dynastyLIArcher = 24;
        int dynastyLIRider = 46;

        int dynastyMinWarrior = 9;
        int dynastyMinArcher = 35;
        int dynastyMinRider = 12;

        int dynastyLIWarriorsEveryType = 860;
        double dynastyMinWarriorsEveryType = dynastyLIWarriorsEveryType * 1.5;

        double totalAttackRateDynastyLI = (dynastyLIWarrior + dynastyLIArcher + dynastyLIRider) * dynastyLIWarriorsEveryType;
        double totalAttackRateDynastyMin = (dynastyMinWarrior + dynastyMinArcher + dynastyMinRider) * dynastyMinWarriorsEveryType;

        System.out.println("Значення загальної атаки династії Лі: " + totalAttackRateDynastyLI);
        System.out.println("Значення загальної атаки династії Мінь: " + totalAttackRateDynastyMin);
    }
}
