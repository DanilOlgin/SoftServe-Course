import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseConverter1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int degreesCelsius = Integer.parseInt(reader.readLine());

        System.out.println(new KelvinDegrees1().convert(degreesCelsius) + " - температура в кельвинах");
        System.out.println(new FahrenheitDegrees1().convert(degreesCelsius) + " - температура в фаренгейтах");
    }
}

class KelvinDegrees1 implements Convertible {
    @Override
    public double convert(double degrees) {
        return degrees + 273.15;
    }
}

class FahrenheitDegrees1 implements Convertible {
    @Override
    public double convert(double degrees) {
        return degrees * 9 / 5 + 32.5;
    }
}

interface Convertible {
    double convert(double a);
}

