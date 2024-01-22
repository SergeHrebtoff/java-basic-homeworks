package ru.hrebtoff.java.basic.homeworks.homework1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для выбора проверяемого метода");
        System.out.println("введите соответствующую ему цифру из списка");
        System.out.println(
                "1 --> greetings()\n" +
                "2 --> checkSign()\n" +
                "3 --> selectColor()\n" +
                "4 --> compareNumbers()\n" +
                "5 --> addOrSubstructAndPrint()");

        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                greetings();
                // Реализуйте метод greetings(),
                // который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
                break;
            case 2:
                int a = (int)((Math.random()*10)-(Math.random()*10));
                int b = (int)((Math.random()*20)-(Math.random()*20));
                int c = (int)((Math.random()*15)-(Math.random()*15));
                checkSign(a,b,c);
                // Реализуйте метод checkSign(..), принимающий в качестве аргументов
                // 3 int переменные a, b и c. Метод должен посчитать их сумму,
                // и если она больше или равна 0, то вывести в консоль сообщение
                // “Сумма положительная”, в противном случае - “Сумма отрицательная”;v
                break;
            case 3:
                selectColor();
                // Реализуйте метод selectColor() в теле которого задайте
                // int переменную data с любым начальным значением.
                // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
                // если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
                break;
            case 4:
                compareNumbers();
                // Реализуйте метод compareNumbers(), в теле которого объявите две
                // int переменные a и b с любыми начальными значениями.
                // Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”,
                // в противном случае “a < b”;
                break;
            case 5:
                int initValue = (int)((Math.random()*100)-(Math.random()*100));
                int delta = (int)((Math.random()*50)-(Math.random()*50));
                boolean increment;
                if (Math.random() > 0.5) increment = true;
                else increment = false;
                addOrSubstructAndPrint(initValue, delta, increment);
                // Создайте метод addOrSubtractAndPrint(int initValue,
                // int delta, boolean increment). Если increment = true,
                // то метод должен к initValue прибавить delta и отпечатать в консоль результат,
                // в противном случае - вычесть;
                break;


        }
    }

    public static void greetings() {

        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int result = a+b+c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("сумма = " + result);

        if (result < 0) {
            System.out.println("Сумма отрицательная");
        } else {
            System.out.println("Сумма положительная");
        }

    }

    public static void selectColor() {
        int data;
        data = 15;

        if (data > 20) {
            System.out.println("Зеленый");
        } else if (data <= 10) {
            System.out.println("Красный");
        } else {
            System.out.println("Желтый");
        }

    }

    public static void compareNumbers() {
        int a = 158;
        int b = 286;

        if (a < b) {
            System.out.println("a<b");
        } else {
            System.out.println("a>=b");
        }


    }

    public static void addOrSubstructAndPrint(int initValue, int delta, boolean increment) {
        int result;

        if (increment) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println("InitValue = " + initValue);
        System.out.println("delta = " + delta);
        System.out.println("increment = " + increment);
        System.out.println("Результат = " + result);
    }
}
