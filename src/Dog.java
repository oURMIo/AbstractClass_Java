public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void name_danger() {
        System.out.printf("I'm a " + name + " and i'm not dangerous, so put meat in plate %n");
    }
}