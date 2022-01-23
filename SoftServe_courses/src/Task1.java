/*

Задача 7.9
Напишите класс, который принимает с клавиатуры три числа: два первых должны быть длинами сторон катетов прямоугольного треугольника,
а третье - длиной гипотенузы. Программа должна проверить, соответствуют ли введенные значения этому требованию.
Внимание: допустимо предположить, что все вводимые числа - положительные.
*/ 
        import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int side1 = Integer.parseInt(reader.readLine());
        int side2 = Integer.parseInt(reader.readLine());
        int side3 = Integer.parseInt(reader.readLine());

        if (side3*side3 == (side1*side1 + side2*side2)) {
            System.out.println("Это прямоугольный треугольник");
        }
        else System.out.println("Это НЕ прямоугольный треугольник");
    }
}
