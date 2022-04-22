public abstract class Animal {
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected String superMethod(){
        return "I'm an animal with name " + name;
    }

    public abstract void name_danger();
}