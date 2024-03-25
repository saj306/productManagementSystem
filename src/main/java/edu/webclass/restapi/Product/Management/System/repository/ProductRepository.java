package edu.webclass.restapi.Product.Management.System.repository;

import edu.webclass.restapi.Product.Management.System.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductRepository {
    public static ArrayList<Product> products = new ArrayList<>();
    public static int lastIndex = 0;

    public ProductRepository() {
        products.add(new Product("Mobile", "Samsung", 50000000));
        products.add(new Product("Cacke", "TITOP!", 10000));
        products.add(new Product("Laptop", "Dell", 20000000));
        products.add(new Product("Tablet", "Apple", 15000000));
        products.add(new Product("Smart Watch", "Xiaomi", 5000000));
        products.add(new Product("Headphone", "Sony", 3000000));
    }

    public boolean createNewProduct(Product product) {
        products.add(product);
        if (ProductRepository.lastIndex == ProductRepository.products.size()) {
            return true;
        } else {
            return false;
        }
    }

    public List<Product> findAllProducts() {
        return products;
    }

    public Product findProduct(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
