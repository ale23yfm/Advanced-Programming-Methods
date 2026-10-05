package box.repository;

import box.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private List<Item> items = new ArrayList<>();

    public void add(Item item)
    {
        items.add(item);
    }

    public List<Item> getAll() {
        return items;
    }
}
