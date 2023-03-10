package HomeWorks.HomeWork13Lesson10;

public class Burger {

    String  bun;
    int meat;
    char cheese;
    String greens;
    String mayonnaise;
    int doubleMeat;

    public Burger(String bun, int meat, char cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Звичайний бургер, склад: булка - " + bun + ", грам м'яса - " + meat + ", класс сиру - "
                + cheese + ", зелень - " + greens + ", " + mayonnaise);
    }

    public Burger(String bun, int meat, char cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;

        System.out.println("Дієтичний бургер, склад: булка - " + bun + ", грам м'яса - " + meat + ", класс сиру - "
                + cheese + ", зелень - " + greens);
    }

    public Burger(int doubleMeat, String bun, char cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;

        System.out.println("Бургер з подвійним м'ясом, склад: булка - " + bun + ", грам м'яса - " + doubleMeat +", клас сиру - "
                + cheese + ", зелень - " + greens + ", " + mayonnaise);
    }
}
