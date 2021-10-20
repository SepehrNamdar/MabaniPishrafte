package shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Acceptance Test
public class ItemTest {

    private ShoppingListService shoppingList;
    private List<Item> itemList;

    @BeforeEach
    void setUp() {
        shoppingList = new ShoppingListServiceImpl(new ShoppingListDAOImplDouble());
        itemList = new LinkedList<>();
    }

    @Test
    void should_check_if_item_names_are_not_null_or_empty() {
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item("Orange", 2));

        assertDoesNotThrow(() -> shoppingList.saveItems(itemList));
    }

    @Test
    void should_throw_item_name_exception_when_an_item_with_null_name_exist() {
        itemList.add(new Item("Banana", 5));
        itemList.add(new Item(null, 2));

        assertThrows(ItemNameException.class, () -> shoppingList.saveItems(itemList));
    }

    @Test
    void should_throw_item_name_exception_when_an_item_with_empty_name_exist() {
        itemList.add(new Item("", 5));
        itemList.add(new Item("Orange", 2));

        assertThrows(ItemNameException.class, () -> shoppingList.saveItems(itemList));
    }

    @Test
    void should_throw_item_quantity_exception_when_an_item_has_a_quantity_less_than_1() {
        itemList.add(new Item("Banana", 0));
        itemList.add(new Item("Orange", 2));

        assertThrows(ItemQuantityException.class, () -> shoppingList.saveItems(itemList));
    }

    @Test
    void should_throw_item_quantity_exception_when_an_item_has_a_quantity_greater_than_100() {
        itemList.add(new Item("Banana", 20));
        itemList.add(new Item("Orange", 101));

        assertThrows(ItemQuantityException.class, () -> shoppingList.saveItems(itemList));
    }

    static class ShoppingListDAOImplDouble implements ShoppingListDAO {

        @Override
        public List<Item> findAllItems() {
            return null;
        }

        @Override
        public void saveItems(List<Item> items) {
            System.out.println("save Item of class ShoppingListDAOImplDouble is called");
        }
    }
}
