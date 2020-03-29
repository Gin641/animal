import animal.*;
import edible.*;
public class testanimal {
    public static void main(String[] args) {
        animal[] animals = new animal[2];
        animals[1] = new ga();
        animals[0] = new ho();
        for (animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof ga){
                edible edible = (ga) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
