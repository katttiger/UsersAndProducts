package se.iths.cecilia.usersandproducts.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import se.iths.cecilia.usersandproducts.model.Product;

import java.util.List;

@Service
public class ProductsService {
    public String ProductsServerServcie(Model model) {
        List<Product> products = List.of(
                new Product("Kläder", 100.0F, "Vit tröja"),
                new Product("Kläder", 150.0F, "Svarta byxor")
        );
        model.addAttribute("product", products);
        return "product";
    }
}
