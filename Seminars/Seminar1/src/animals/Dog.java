package animals;

public class Dog extends Animal
{
    public Dog (String name)
    {
        super(name);
    }

    public void bark()
    {
        System.out.println("animals.Dog " + this.name + " barks");
    }

    public void groom()
    {
        System.out.println("animals.Dog " + this.name + " is taking a bath");
    }

    @Override // not necessary
    public void hunt()
    {
        System.out.println("animals.Dog " + this.name + " hunts");
    }
}
