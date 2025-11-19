// Driver for the Enemy inheritance lab

public class GameDriver {

    public static void main(String[] args) {

        // TODO: Add this commented line to show that Enemy cannot be instantiated:
        // Enemy e = new Enemy();

        // TODO: Create an Enemy[] array with:
        Enemy Enemy[] = {new Slime(), new Skeleton(), new Dragon()};
        // new Slime(...)
        // new Skeleton(...)
        // new Dragon(...)

        // TODO: Loop through the array and call:
        // update(), attack(), takeDamage()
        for (Enemy mob : Enemy){
            System.out.println("=== " +mob.name+ " ===");
            mob.update();
            mob.attack();
            mob.takeDamage(5);
        }

        // TODO: Add reflection answers as comments at the bottom of this file
    }
}