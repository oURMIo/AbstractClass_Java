/*
 * Animal
 *
 */

public abstract class Animal {
    protected final String name;        //JUST NAME
    protected final boolean danger;     //DANGER OR NOT

    //ASSIGNMENT FOR EACH CHILD CLASS
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

    //METOD VOICE RETURN VOICE
    public abstract String voice();

    //METOD WRITE TEXT
    public void name_danger() {
        if (danger) {
            System.out.printf("I'm a " + name + " and I'm dangerous and I say " + voice() + "! So throw meat and run away!!! %n");  /* IF CLASS DANGER*/
        } else {
            System.out.printf("I'm a " + name + " and I'm not dangerous and I say " + voice() + "! So put meat in plate %n");       /* IF CLASS NOT DANGER*/
        }
    }
/*
    //NOT USED
    protected String superMethod(){
        return "I'm an animal with name " + name;
    }
 */
}