package br.com.reinan.dscatalog.tests;

import java.time.Instant;

import br.com.reinan.dscatalog.dto.CategoryDTO;
import br.com.reinan.dscatalog.dto.ProductDTO;
import br.com.reinan.dscatalog.entities.Category;
import br.com.reinan.dscatalog.entities.Product;

public class Factory {

    public static Product createProduct() {
        Product product = new Product("PS5", 600.0, Instant.parse("2020-07-20T10:00:00Z"),
                "The new generation PS5 video game", "");

        product.getCategories().add(new Category(2L, "Eletronics"));
        return product;
    }

    public static Product createProductUpdate() {
        Product product = new Product("Percy Jackson", 40.0, Instant.parse("2020-07-20T10:00:00Z"),
                "Percy Jackson Book", "");

        product.getCategories().add(new Category(1L, "Books"));
        return product;
    }

    public static ProductDTO createProductDto() {
        Product prod = createProduct();
        return new ProductDTO(prod, prod.getCategories());
    }

    public static Category createCategory() {

        return new Category(null, "category");
    }

    public static CategoryDTO createCategoryDto() {
        Category cate = createCategory();
        return new CategoryDTO(cate);
    }

}
