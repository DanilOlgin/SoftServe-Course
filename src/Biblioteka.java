import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Biblioteka {
    public static void main(String[] args) throws IOException {
        System.out.println("Желаете добавить книгу?");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        ArrayList<Kniga> bookshelf = new ArrayList<>();

        while (name.equals("yes") || name.equals("y")) {
            System.out.println("Введите автора:");
            String author = reader.readLine();
            System.out.println("Введите количество страниц книги:");
            int numberOfPages = Integer.parseInt(reader.readLine());
            Kniga kniga = new Kniga(author, numberOfPages);
            bookshelf.add(kniga);
            System.out.println("Вы желаете добавить еще книгу? Введите yes или y для продолжения.");
            name = reader.readLine();
        }

        System.out.println("Вы ввели следующие книги:");
        for (Kniga a : bookshelf) {
            System.out.println(a.toString());
        }

        System.out.println("---------------------------------------");
        System.out.println("Сортировка по количеству страниц:");
        bookshelf = (ArrayList<Kniga>) bookshelf.stream().
                sorted(Comparator.comparing(b -> b.numberOfPages))
                .collect(Collectors.toList());
        for (Kniga a : bookshelf) {
            System.out.println(a.toString());
        }

        System.out.println("---------------------------------------");
        System.out.println("Сортировка по автору:");
        bookshelf = (ArrayList<Kniga>) bookshelf.stream()
                .sorted(Comparator.comparing(b -> b.author))
                .collect(Collectors.toList());
        for (Kniga a : bookshelf) {
            System.out.println(a.toString());
        }
    }
}

class Kniga {
    private String author;
    private int numberOfPages;

    Kniga(String author, int numberOfPages) {
        this.author = author;
        this.numberOfPages = numberOfPages;
    }


    @Override
    public String toString() {
        return "Kniga{" +
                "author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
