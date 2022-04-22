public abstract class Animal {
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void name_danger();
}