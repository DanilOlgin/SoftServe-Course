//Напишите класс BaseConverter для конвертации из градусов по Цельсию в
//        Кельвины ,  Фаренгейты , и так далее. У класса должен быть метод convert, который
//        и делает конвертацию.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int degreesCelsius = Integer.parseInt(reader.readLine());

        System.out.println(KelvinDegrees.convert(degreesCelsius));
        System.out.println(FahrenheitDegrees.convert(degreesCelsius));
    }
}

abstract class KelvinDegrees {
    public static double convert(double degrees) {
      return degrees + 273.15;
    }
}

abstract class FahrenheitDegrees {
    public static double convert(double degrees) {
        return degrees * 9 / 5 + 32.5;
    }
}

