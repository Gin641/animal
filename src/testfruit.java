import fruit.*;
public class testfruit {
    public static void main(String[] args) {
        fruit[] fruits = new fruit[2];
        fruits[0] = new orange();
        fruits[1] = new apple();
        for (fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
