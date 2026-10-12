package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id){
        Address address = new Address( "Ramakirishna", "Colombo", "6");

        return new Customer(id, "Thamiliny",19.99, address);
    }
}
