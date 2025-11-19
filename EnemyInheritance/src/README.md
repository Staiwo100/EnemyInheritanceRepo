## **1. Why can’t you instantiate the Enemy class?**  
  You cannot instantiate the Enemy class because it is an abstract class, and you cannot create objects for an abstract class.
## **2. What would happen if a subclass did not implement update() or attack()?**  
  If any of the subclasses extending from the Enemy class did not implement update() or attack(), there would an error due to the fact that Enemy is an abstract class.
## **3. How does using Enemy[] demonstrate polymorphism?**  
  The Enemy class is used as a blueprint for the subclasses, and the subclasses extend off the Enemy class and become unique in thier own way.
## **4. Why is it helpful for Enemy to have a concrete method like takeDamage()?**  
  The concrete method makes the action of the mob taking damage then displaying their remaining health more automated. With this method you only have to make the method in the Enemy class and dont have to go through the trouble of making the class in every subclass. This can be way more useful on even bigger projects.
## **5. Could this design be implemented using interfaces alone? Why or why not?**  
