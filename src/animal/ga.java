package animal;
import edible.edible;
public class ga extends animal implements edible {
    @Override
    public String makeSound(){
        return "o...o...o";
    }
    @Override
    public String howToEat(){
        return "nau chin";
    }
}
