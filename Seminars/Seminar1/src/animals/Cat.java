package animals;

public class Cat extends Animal {
    public Cat (String name)
    {
        super(name);
    }

    public void groom()
    {
        System.out.println("animals.Cat " + this.name + " is taking a bath");
    }

    public void meow()
    {
        System.out.println("animals.Cat " + this.name + " is meowing");
    }
}
