package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        String name1 = "Mleko";
        String producer1 = "Mlekowita";
        double price1 = 2.5;
        String name2 = "Czekolada";
        String producer2 = "Wedel";
        double price2 = 2.19;
        String currency = "zł";

        System.out.printf("%s %s %f%s\n", name1, producer1, price1, currency);
        System.out.printf("%s %s %f%s\n", name2, producer2, price2, currency);
    }
}
