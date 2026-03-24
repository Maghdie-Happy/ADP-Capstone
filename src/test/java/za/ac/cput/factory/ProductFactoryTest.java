/*
 *ProductFactoryTest.java
 *Test Class for ProductFactory
 *Maghdie Petersen 230600204
 *  */
package za.ac.cput.factory;

import za.ac.cput.domain.ProductDomain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductFactoryTest {
    @Test
    public void testCreateProductSuccess() {
        ProductDomain product = ProductFactory.createProduct(
                "Industrial Grade Fertilizer",
                "Agriculture",
                750.00,
                "50Kg Bag");
        assertNotNull(product, "Factory failed to create the ProductDomain object with valid input.");
        assertNotNull(product.getProductId(), "Factory failed to generate a unique Product ID.");
        assertEquals("Agriculture", product.getCategory(), "Product category does not match the expected value.");
    }

    @Test
    public void testCreateProductWithNegativePrice() {
        ProductDomain product = ProductFactory.createProduct(
                "Crate of Oranges",
                "Food & Beverage",
                -89.00,
                "Crate");
        assertNull(product, "Factory should return null when a negative price is provided.");
    }

    @Test
    public void testCreateProductWithEmptyDescription(){
        ProductDomain product = ProductFactory.createProduct(
                "",
                "Transportation",
                500,
                "Liters");
        assertNull(product, "Factory should return null when the description is empty.");
    }
}
