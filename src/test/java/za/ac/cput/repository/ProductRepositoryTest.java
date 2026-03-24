/*
 *ProductRepositoryTest.java
 *TDD implementation for Repository Layer
 *Maghdie Petersen 230600204
 *  */
package za.ac.cput.repository;

import za.ac.cput.domain.ProductDomain;
import za.ac.cput.factory.ProductFactory;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductRepositoryTest {

    private static IProductRepository repository = ProductRepository.getRepository();

    private static ProductDomain product = ProductFactory.createProduct(
            "Industrial Grade Fertilizer",
            "Agriculture",
            800.00,
            "50Kg Bag");

    @Test
    @Order(1)
    public void testCreate() {
        ProductDomain created = repository.create(product);
        assertNotNull(created, "Repository failed to create the product.");
        assertEquals(product.getProductId(), created.getProductId(),
                "Created ID should not match input ID.");
    }

    @Test
    @Order(2)
    public void testRead() {
        ProductDomain read = repository.read(product.getProductId());
        assertNotNull(read, "Repository failed to read the product by ID.");
        assertEquals("Agriculture", read.getCategory(),
                "The category of the read product is incorrect.");
    }

    @Test
    @Order(3)
    public void testUpdate() {
        ProductDomain updatedProduct = new ProductDomain.Builder()
                .copy(product)
                .setPrice(1500.00)
                .setDescription("Premium Industrial Fertilizer")
                .build();

        ProductDomain

        assertNotNull(created, "Repository failed to create the product.");
        assertEquals(product.getProductId(), created.getProductId(),
                "Created ID should not match input ID.");
    }
}
