package edu.webclass.restapi.Product.Management.System.services;

import edu.webclass.restapi.Product.Management.System.exceptions.EntityNotFoundException;
import edu.webclass.restapi.Product.Management.System.models.Product;
import edu.webclass.restapi.Product.Management.System.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAllProducts();
    }

    public Product findProduct(String id) {
        if (productRepository.findProduct(id) == null) {
            throw new EntityNotFoundException("Product not found");
        }
        return productRepository.findProduct(id);
    }

    public boolean addProduct(String title, String brand, int price) {
        return productRepository.createNewProduct(new Product(title, brand, price));
    }


}
