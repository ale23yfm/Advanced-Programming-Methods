package box.view;

import box.controller.ItemController;
import box.model.Item;
import box.repository.ItemRepository;

import java.util.List;

public class ItemView {
    private ItemController itemController;

    public ItemView(ItemController itemController)
    {
        this.itemController =  itemController;
    }

    public void startMenu()
    {
        try {
            System.out.println("Adding cakes");
            itemController.addCake(23);
            itemController.addCake(34);
            itemController.addCake(234);

            System.out.println("Adding books");
            itemController.addBook(23);
            itemController.addBook(565);
            itemController.addBook(56);

            System.out.println("Adding apples");
            itemController.addApple(23);

            System.out.println("Items: " + itemController.getGreaterThan200().toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
