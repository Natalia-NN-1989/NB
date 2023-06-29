package lesson3_4;

public class Main {

    public static void main(String[] args) {
        Tree kaktus = new Tree();
        Tree lipa = new Tree(true);
        Tree topol = new Tree("Topol", 11, false);
        System.out.println(kaktus.toString());
        System.out.println(lipa.toString());
        System.out.println(topol.toString());
    }
}
