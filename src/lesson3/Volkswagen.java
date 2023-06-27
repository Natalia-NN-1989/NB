/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson3;
class Volkswagen {
  String color;
    String name;
    int weight;  

 public Volkswagen () {
}
public Volkswagen (String color) {
  this.color=color;
   this.name= "Polo";
   this.weight= 800;
   
} 
public Volkswagen (String color, int weight) {
    this.color=color;
   this.name= "Tiguan";
   this.weight= weight;
    }
}