public class Giena extends Animal {
    public Giena() {
        super("Giena");
    }

    @Override
    public void name_danger() {
        System.out.printf("I'm a " +getName() + " - and i'm dangerous, so put meat in plate %n");
    }
}