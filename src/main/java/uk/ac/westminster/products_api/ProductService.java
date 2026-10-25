package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public List<Product> getAllProducts(){
        return products;
    }

    public Product addProduct(Product product){
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id){
        return products.stream()
                .filter(p ->p.getId().equals(id))
                .findFirst();
    }

    public void deleteProduct(Long id){
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name){
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

    public ProductService(){
        products.add(new DigitalProduct( 1L,"Java Programming eBook", 19.99, "https://example.com/java-ebook", 25.5));
        products.add(new PhysicalProduct(2L, "Wireless Mouse", 29.99, 0.25, "10 x 6 x 4 cm"));
    }
}
