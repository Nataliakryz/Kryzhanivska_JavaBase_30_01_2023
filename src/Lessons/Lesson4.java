package Lessons;

import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        // double a = 10;
//        int a = 10;
//        int b = 3;
//
//        double result = a/b;

        // System.out.println(result);

        //Залишок від ділення % (3*3=9; 10-9=1)

        // System.out.println(a % b);
//        System.out.println(10 % 1);
//        System.out.println(10 % 2);
//        System.out.println(10 % 3);
//        System.out.println(10 % 4);
//        System.out.println(10 % 5);
//        System.out.println(10 % 6);
//        System.out.println(10 % 7);
//        System.out.println(10 % 8);
//        System.out.println(10 % 9);
//        System.out.println(10 % 10);

//       Скорочені операції
//        int x = 10;
        // x = x + 5;
//        x += 5;
//        x -= 5;
//        x /= 5;
//        x *= 5;
//        x %= 5;
//
//        System.out.println(x);

//        2. Префіксний (++x) та постфіксний (x++) інкремент та декремент (--x; x--;)
//        постфіксний інкремент спочатку віддає (напр. println) а потім змінює, префіксний спочатку змінює, а потім віддією
//        int x = 10;
//        x = x + 1;
//        x +=1;
//        x++;

//        System.out.println(x++ + ++x); // 10 (але int x = 11;) + 12 = 22
//        System.out.println(x);         // 12

//        3. Math

//        System.out.println(Math.round(10.99));
//
//        System.out.println(Math.random()); // 0 - 0.999999999...
//        System.out.println(Math.random() * 10);
//
//        double random = Math.random() * 10; // 0*10=0; 0,999999*10=9.9999999
//        int result = (int) Math.round(random);
//        System.out.println(result);
//
//        System.out.println((int) Math.random() *11); // 0; 10,999999999 -> int 10


        // Задачка

//        int employee1 = 700;
//        int employee2 = 1500;
//        int employee3 = 3500;
//
//        int monthAndYears = 10 * 12;
//
//        int salaryEmployee1for10Years = employee1 * monthAndYears;
//        int salaryEmployee2for10Years = employee2 * monthAndYears;
//        int salaryEmployee3for10Years = employee3 * monthAndYears;
//
//        System.out.println("ЗП за 10 років для працівника 1: " + salaryEmployee1for10Years);
//        System.out.println("ЗП за 10 років для працівника 2: " + salaryEmployee2for10Years);
//        System.out.println("ЗП за 10 років для працівника 3: " + salaryEmployee3for10Years);
//
//        double salaryEmployee1for10YearsWithoutTax = salaryEmployee1for10Years * 0.95;
//        double salaryEmployee2for10YearsWithoutTax = salaryEmployee2for10Years * 0.95;
//        double salaryEmployee3for10YearsWithoutTax = salaryEmployee3for10Years * 0.95;
//
//        System.out.println();
//        System.out.println("ЗП за 10 років для працівника 1 з виключенням податків: " + salaryEmployee1for10YearsWithoutTax);
//        System.out.println("ЗП за 10 років для працівника 2 з виключенням податків: " + salaryEmployee2for10YearsWithoutTax);
//        System.out.println("ЗП за 10 років для працівника 3 з виключенням податків: " + salaryEmployee3for10YearsWithoutTax);
//
//        double avgSalary = (salaryEmployee1for10Years + salaryEmployee2for10Years + salaryEmployee3for10Years) / 3.0;
//
//        System.out.println();
//        System.out.println("Середнє арифметичне за трьома сумами за 10 років: " + avgSalary);


        Scanner scanner = new Scanner(System.in);
        String str = scanner.next(); // зчитує рядок до пробіла

        System.out.println("str = " + str);

        String asd = scanner.nextLine(); // зчитує до переноса рядка

        Scanner scanner1 = new Scanner(System.in);

//        System.out.println("Please enter some string");
//        String str = scanner.nextLine();
//        String str2 = scanner.nextLine();
//        String str3 = scanner.nextLine();
//        String str4 = scanner.nextLine();
//
//        System.out.println("str = " + str);
//        System.out.println("str2 = " + str2);
//        System.out.println("str3 = " + str3);
//        System.out.println("str4 = " + str4);


        System.out.println("Please enter some integer");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

//        System.out.println("Please enter some string");
//        String str = scanner.nextLine();
//        System.out.println("str = " + str);

    }

}
