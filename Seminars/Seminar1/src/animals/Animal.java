package animals;

public abstract class Animal {
    String name;

    public Animal (String name)
    {
        this.name = name;
    }

    public void hunt()
    {
        System.out.println("animals.Animal " + this.name + " hunts");
    }

    public abstract void groom();
}
