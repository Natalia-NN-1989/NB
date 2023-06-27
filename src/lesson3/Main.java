package lesson3;

public class Main {
    public static void main(String[] args) {
          Volkswagen tiguan=new Volkswagen("blue", 1000);
          Volkswagen polo=new Volkswagen("green");
          System.out.print("111111111111111111111111");
        printCar(tiguan);
        printCar(polo);
    }
   public static void printCar(Volkswagen volkswagen) {
        System.out.print("Информация об авто: ");
        System.out.println("Цвет "+volkswagen.color+"  Название "+volkswagen.name+"  Вес "+ volkswagen.weight );
        
        }

        } 
