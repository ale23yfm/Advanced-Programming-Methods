package box;

import box.controller.ItemController;
import box.repository.ItemRepository;
import box.view.ItemView;

public class Main {
    static void main() {
        ItemRepository itemRepository = new ItemRepository();
        ItemController itemController = new ItemController(itemRepository);
        ItemView itemView = new ItemView(itemController);

        itemView.startMenu();
    }
}
