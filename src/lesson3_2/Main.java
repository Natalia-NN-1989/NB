package lesson3_2;

public class Main {

    public static void main(String[] args) {
        Volkswagen tiguan = new Volkswagen("blue", 1000);
        Volkswagen polo = new Volkswagen("green");

        printCar(tiguan);
        printCar(polo);
    }

    public static void printCar(Volkswagen volkswagen) {
        System.out.print("Информация об авто: ");
        System.out.println("Цвет " + volkswagen.color + "  Название " + volkswagen.name + "  Вес " + volkswagen.weight);

    }

}
