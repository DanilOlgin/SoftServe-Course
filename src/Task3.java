

// Задача 19.71 (схожа с 20.28?)
// Напишите класс, который принимает с клавиатуры целое положительное число N, создает массив размером N и заполняет его случайными
// числами вновь и вновь до получения полного массива. Класс должен вывести на экран окончательный массив и число итераций,
// которые понадобились для получения полного массива.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        int[] array = new int[number];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*1000);
        }

        System.out.println("Число итераций для получения полного массива равно длине массива, а именно - "
                + array.length + ". Окончательный массив выглядит так:");
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
