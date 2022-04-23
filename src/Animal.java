public abstract class Animal {
    protected final String name;
    protected final boolean danger;

    protected Animal(String name, boolean danger) {
        this.name = name;
        this.danger = danger;
    }

    //geters
    public String getName() {
        return name;
    }
    public boolean getDanger(){
        return danger;
    }

    public abstract String voice();

    public void name_danger(){
        if (danger){
            System.out.printf("I'm a " + name + " and I'm dangerous and I say " + voice() + "! So throw meat and run away!!! %n");
        } else{
            System.out.printf("I'm a " + name + " and I'm not dangerous and I say " + voice() + "! So put meat in plate %n");
        }
    }

//    protected String superMethod(){
//        return "I'm an animal with name " + name;
//    }
}