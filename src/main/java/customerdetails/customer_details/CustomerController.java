package customerdetails.customer_details;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CustomerController {

    @GetMapping("/yavatmal-customers")
    public List<String> getYavatmalCustomers() {


        Customer customer1 = new Customer("Nilesh");
        customer1.addAddress(new Address("Yavatmal", "Maharashtra"));
        customer1.addAddress(new Address("Pune", "Maharashtra"));

        Customer customer2 = new Customer("Rahul");
        customer2.addAddress(new Address("Mumbai", "Maharashtra"));

        Customer customer3 = new Customer("Priya");
        customer3.addAddress(new Address("Yavatmal", "Maharashtra"));

        List<Customer> customers = Arrays.asList(customer1, customer2, customer3);


        return customers.stream()
                .filter(c -> c.getAddresses().stream()
                        .anyMatch(a -> "Yavatmal".equalsIgnoreCase(a.getCity())))
                .map(Customer::getName)
                .collect(Collectors.toList());
    }
}
