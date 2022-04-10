public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Wolf wolf = new Wolf();
        Shakal shakal = new Shakal();
        Giena giena = new Giena();

        dog.type();
        dog.danger();
        dog.feed();

        wolf.type();
        wolf.danger();
        wolf.feed();

        shakal.type();
        shakal.danger();
        shakal.feed();

        giena.type();
        giena.danger();
        giena.feed();
    }
}
