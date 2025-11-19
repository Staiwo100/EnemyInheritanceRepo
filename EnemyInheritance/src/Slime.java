// Slime enemy subclass

// TODO: Extend Enemy

public class Slime extends Enemy {


    // TODO: Create constructor
    Slime(){
        super(20, 5, "Green Slime");
    }

    // TODO: Implement update()
    @Override
    public void update(){
        System.out.println("The slime inches closer.");
    }
    // TODO: Implement attack()
    @Override
    public void attack(){
        System.out.println("The slime spits out nasty goo!");
    }
}