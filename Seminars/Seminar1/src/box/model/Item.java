package box.model;

public abstract class Item
{
    public int weight;

    @Override
    public String toString()
    {
        return "Item: " + weight;
    }
}
