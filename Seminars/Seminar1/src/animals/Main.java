package animals;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Person person = new Person();
        person.name = "Ale";
        person.hello();

        Dog dog = new Dog("Cutzu");
        //dog.name = "Cutzu";
        dog.hunt();
        dog.bark();

        Animal dog1 = new Dog("Puffy");
//        dog1.name = "Puffy";
        dog1.hunt();

        if (dog1 instanceof Dog) {
            Dog actualdog1 = (Dog) dog1; //Casting
            actualdog1.bark();
        }
        //we cannot instantiate abstract class
        //animals.Animal a = new animals.Animal()

//Interfata e ca un template - what s the behavior or method
    }
}