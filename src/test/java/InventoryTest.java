import com.zipcodewilmington.productmanager.Inventory;
import com.zipcodewilmington.productmanager.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class InventoryTest {


    @Test
    public void constructorTest() {

        //Given
        List<Product> productList = new ArrayList<Product>();

        //When
        Inventory inventory = new Inventory(productList);

        //Then
        Assert.assertEquals(productList, inventory.getProductList());
    }
    @Test
    public void nullaryConstructorTest() {

        //Given
        List<Product> productList = new ArrayList<Product>();

        //When
        Inventory inventory = new Inventory(productList);

        List<Product> actual = inventory.getProductList();

        //Then
        Assert.assertNotNull(productList);

        Assert.assertEquals(productList,actual);
    }
    @Test
    public void addTest() {

        //Given
        List<Product> productList = new ArrayList<Product>();

        Inventory inventory = new Inventory(productList);

        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        inventory.add(product);

        //Then
        Assert.assertTrue(inventory.contains(product));
    }
    @Test
    public void removeTest() {

        //Given
        List<Product> productList = new ArrayList<Product>();

        Inventory inventory = new Inventory(productList);

        Product product = new Product(79.99, 2, 20, "Hoodie");

        //When
        inventory.remove(product);

        //Then
        Assert.assertFalse(inventory.contains(product));



    }
    @Test
    public void sizeTest() {

        //Given
        List<Product> productList = new ArrayList<Product>();

        Inventory inventory = new Inventory(productList);

        Product product = new Product(79.99, 2, 20, "Hoodie");

        inventory.add(product);

        int expected = 1;

        //When
        int actual = inventory.size();

        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getTotalValue() {

        //Given
        List<Product> productList = new ArrayList<Product>();

        Product product = new Product(79.99, 2, 20, "Hoodie");

        Inventory inventory = new Inventory(productList);


        //When
        inventory.getTotalValue();


        //Then
    }


}
