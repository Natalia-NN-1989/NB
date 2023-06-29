package lesson3_2;

class Volkswagen {

    String color;
    String name;
    int weight;

    public Volkswagen() {
    }

    public Volkswagen(String color) {
        this.color = color;
        this.name = "Polo";
        this.weight = 800;

    }

    public Volkswagen(String color, int weight) {
        this.color = color;
        this.name = "Tiguan";
        this.weight = weight;
    }
}
