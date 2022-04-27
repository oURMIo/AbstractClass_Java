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

        dog.nameDanger();
        feed(dog);

        wolf.nameDanger();
        feed(wolf);

        shakal.nameDanger();
        feed(shakal);

        giena.nameDanger();
        feed(giena);
    }

    //METOD FOR FEED
    private static void feed(Animal pers) {
        System.out.printf(" feed - %s %n %n", pers.name);
    }
}