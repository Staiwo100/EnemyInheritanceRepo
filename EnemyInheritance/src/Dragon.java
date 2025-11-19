// Dragon enemy subclass

// TODO: Extend Enemy

public class Dragon extends Enemy {

    // TODO: Create constructor (call super)
    Dragon(){
        super(100, 5, "Ancient Dragon");
    }

    // TODO: Implement update()
    @Override
    public void update() {
        System.out.println("The Ancient Dragon circles the battlefield from above.");
    }


    // TODO: Implement attack()

    @Override
    public void attack() {
        System.out.println("The Ancient Dragon breathes a massive fire blast!");
    }
}
