package HomeWorks.HomeWork13Lesson11;

public class Main {
    public static void main(String[] args) {

//        Зробіть програму для фітнес трекера, яка реєструватиме нового користувача створюючи йому обліковий запис,
//        приймаючи наступні параметри:
//           Незмінні (задаються тільки при створенні облікового запису, і можуть бути отримані лише за допомогою гетерів):
//        1. Ім'я
//        2. Дата народження (окремо день, місяць, рік)
//        3. Емейл
//        4. Телефон
//           Змінювані:
//        1. Прізвище
//        2. Вага
//        3. Тиск
//        4. Кількість пройдених за день кроків

//        Створювати кожного користувача необхідно через конструктор, беручи всі поля на вхід конструктора.
//                Додати метод printAccountInfo(), при виклику якого друкувати всі дані про користувача
//        Після прийому року народження - вираховувати вік користувача у внутрішню змінну age (відштовхуючись просто
//        від 2020 року, ускладнювати тут не будемо), на яку зробити тільки геттер і виводити на екран разом з іншими
//        полями в методі printAccountInfo(); у конструкторі або геттерах/сеттерах не використовуємо виведення в консоль.
//        У main-класі створити 3-5 користувачів та роздрукувати дані кожного через виклик методу printAccountInfo();
//        для двох користувачів змінити кілька полів та роздрукувати нові дані повторно

        RegistrationNewCustomer newCustomer1 = new RegistrationNewCustomer("Іван", "123", 10,
                10, 1995, "ivan@gmail.com", "Іванов", 84.5, "120/60",
                1000);

        RegistrationNewCustomer newCustomer2 = new RegistrationNewCustomer("Марія", "12345",
                20,12, 1980, "maria@gmail.com", "Бондур", 55.5,
                "120/80", 2000);

        RegistrationNewCustomer newCustomer3 = new RegistrationNewCustomer("Надія", "1234500",
                28,5, 1960, "bondyr@gmail.com", "Бондур", 67.3,
                "110/60", 4000);

        newCustomer1.printAccountInfo();
        newCustomer2.printAccountInfo();
        newCustomer3.printAccountInfo();
        System.out.println();

        newCustomer2.setSurname("Хвиля");
        newCustomer2.setSteps(2500);

        newCustomer3.setSteps(10000);
        newCustomer3.setWeight(60);

        newCustomer2.printAccountInfo();
        newCustomer3.printAccountInfo();
    }
}
