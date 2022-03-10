package Ex7;

public class Fox implements Animal, Wild {
    String name;
    public Fox(String name){
        this.name = name;
    }

    @Override
    public void sound() {
        System.out.println("Wa-pow");
    }


    @Override
    public void printName() {
        System.out.println("Fox's name is " + name);
    }
}
