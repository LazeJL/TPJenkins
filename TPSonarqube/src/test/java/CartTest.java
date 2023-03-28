import org.testng.annotations.Test;
import org.tpTestFonctionels.Cart;
import org.tpTestFonctionels.Product;

import static org.testng.AssertJUnit.assertEquals;

public class CartTest {
    @Test
    public void testCart() {
        Cart cart = new Cart();
        Product product1 = new Product("iPhone", "Smartphone from Apple", 999.99);
        Product product2 = new Product("Samsung Galaxy", "Smartphone from Samsung", 799.99);
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(1799.98, cart.getTotal(), 0.01);
    }
}
