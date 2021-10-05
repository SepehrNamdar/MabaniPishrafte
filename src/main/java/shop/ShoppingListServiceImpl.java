package shop;

import java.util.List;

public class ShoppingListServiceImpl implements ShoppingListService {

    @Override
    public List<Item> findAllItems() {
        // Get all items from database : Any logic
        return null;
    }

    @Override
    public void saveItems(List<Item> items) {
        for (Item item : items) {
            item.check();
        }

        // save all items in database
    }
}
