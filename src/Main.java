public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Shakal shakal = new Shakal();
        Giena giena = new Giena();

        feed(dog);

        feed(wolf);

        feed(shakal);

        feed(giena);
    }

    private static void feed(Animal pers) {
        pers.name_danger();
        System.out.printf(" feed it %n %n");
    }
}