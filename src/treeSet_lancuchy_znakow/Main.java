package treeSet_lancuchy_znakow;

public class Main {
    public static void main(String[] args)
    {
        java.util.TreeSet<String> zbior1 = new java.util.TreeSet<>();

        zbior1.add("Michał");
        zbior1.add("Agnieszka");
        zbior1.add("Anna");
        zbior1.add("Monika");

        System.out.println("Zbior posiada nastepujace elementy: ");
        for (var element : zbior1)
        {
            System.out.println(element);
        }

        System.out.println("Liczba elementow w zbiorze: " + zbior1.size() + ".");
        zbior1.remove("Agnieszka");
        System.out.println("Liczba elementow w zbiorze po usunieciu elementu 'Agnieszka': " + zbior1.size() + ".");
        System.out.println("Usunięcie wszystkich elementow w zbiorze.");
        zbior1.clear();

        System.out.println("Ostateczna liczba elementow: " + zbior1.size() + ".");

    }
}
