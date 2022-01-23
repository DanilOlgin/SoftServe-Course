/*
Задача 8.31
Напишите класс, который принимает с клавиатуры трехзначное число и изменяет его следующим образом:
        • для четных чисел - все четные цифры увеличиваются на 1, а нечетные уменьшаются на 1; в случае если это невозможно, они остаются неизменными;
        • в нечетных числах все изменения производятся «наоборот».
        Программа должна вывести на экран новое значение переменной.
*/


/* 
NOTE : Верно ли я понимаю, что "в случае если это невозможно, они остаются неизменными" имеются ввиду нечетные числа больше 900, когда при добавлении сотни,
         происходит 9 + 1 = 10 ?

P. S. Задачу можно было решить вводом метода который раскладывает число на цифры и возвращает различные значения в зависимости от чет / нечет.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 99 && number <= 999 && number % 2 == 0) {
            if ((number / 100) % 2 == 0 && (((number / 10) % 10) % 2) == 0) {
                System.out.println(number = number + 100 + 10 + 1);
            } else if ((number / 100) % 2 != 0 && (((number / 10) % 10) % 2) == 0) {
                System.out.println(number = number - 100 + 10 + 1);
            } else if ((number / 100) % 2 == 0 && ((number / 10) % 10 % 2) != 0) {
                System.out.println(number = number + 100 - 10 + 1);
            } else if ((number / 100) % 2 != 0 && ((number / 10) % 10 % 2) != 0) {
                System.out.println(number = number - 100 - 10 + 1);
            }


        } else if (number > 99 && number <= 999) {
            if (number > 900) {
                System.out.println(number);
            } else if ((number / 100) % 2 == 0 && (((number / 10) % 10) % 2) == 0) {
                System.out.println(number = number - 100 - 10 + 1);
            } else if ((number / 100) % 2 != 0 && (((number / 10) % 10) % 2) == 0) {
                System.out.println(number = number + 100 - 10 + 1);
            } else if ((number / 100) % 2 == 0 && ((number / 10) % 10 % 2) != 0) {
                System.out.println(number = number - 100 + 10 + 1);
            } else if ((number / 100) % 2 != 0 && ((number / 10) % 10 % 2) != 0) {
                System.out.println(number = number + 100 + 10 + 1);
            }
        } else {
            System.out.println("Это не целое трехзначное число");
        }
    }
}
