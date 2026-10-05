package box.controller;

import box.model.Apple;
import box.model.Book;
import box.model.Cake;
import box.model.Item;
import box.repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

public class ItemController {
    private ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository)
    {
        this.itemRepository = itemRepository;
    }

    public void addApple(int w)
    {
        Item item = new Apple();
        item.weight = w;
        this.itemRepository.add(item);
    }

    public void addBook(int w)
    {
        Item item = new Book();
        item.weight = w;
        this.itemRepository.add(item);
    }

    public void addCake(int w)
    {
        Item item = new Cake();
        item.weight = w;
        this.itemRepository.add(item);
    }

    public List<Item> getAll() {
        return this.itemRepository.getAll();
    }

    public List<Item> getGreaterThan200() {
        List<Item> result = new ArrayList<>();
        List<Item> inRepo = this.itemRepository.getAll();

        for (Item i : inRepo)
        {
            if (i.weight > 200)
                result.addLast(i);
        }

        return result;

    }
}
