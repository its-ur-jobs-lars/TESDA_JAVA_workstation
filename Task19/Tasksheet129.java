package Task19;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {
    String name;
    int age;

    public Gorilla(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Feeding the gorilla.");
            System.out.println("Food is placed into the cage.");
            return true;
        } else {
            System.out.println("It's not time to feed the gorilla.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla: lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla: pet at your own risk.");
    }
}

public class Tasksheet129 {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla("Jorja", 3);

        System.out.println("Gorilla feeding:");
        gorilla.feed(true);

        System.out.println("\nGorilla grooming:");
        gorilla.groom();

        System.out.println("\nGorilla petting:");
        gorilla.pet();
    }
}
