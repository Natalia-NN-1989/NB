package lesson3;

public class Main {
    public static void main(String[] args) {
          Volkswagen tiguan=new Volkswagen("blue", 1000);
          Volkswagen polo=new Volkswagen("green");
          
        printCar(tiguan);
        printCar(polo);
    }
   public static void printCar(Volkswagen volkswagen) {
        System.out.print("���������� �� ����: ");
        System.out.println("���� "+volkswagen.color+"  �������� "+volkswagen.name+"  ��� "+ volkswagen.weight );
        
        }

        } 
