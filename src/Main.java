/*
 * Main class
 *
 */

public class Main {
    public static void main(String[] args) {
        //OBJECT
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Shakal shakal = new Shakal();
        Giena giena = new Giena();

        dog.name_danger();
        feed(dog);

        wolf.name_danger();
        feed(wolf);

        shakal.name_danger();
        feed(shakal);

        giena.name_danger();
        feed(giena);
    }

    //METOD FOR FEED
    private static void feed(Animal pers) {
        System.out.printf(" feed it %n %n");
    }
}