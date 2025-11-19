// Skeleton enemy subclass

// TODO: Extend Enemy

public class Skeleton extends Enemy {

    // TODO: Create constructor (call super)
    Skeleton(){
        super(30, 5, "Skeleton Archer");
    }
    // TODO: Implement update()
    @Override
    public void update() {
     System.out.println("The Skeleton Archer patrols the area.");
    }

    // TODO: Implement attack()
    @Override
    public void attack() {
        System.out.println("The Skeleton Archer fires an arrow!");
    }
}
