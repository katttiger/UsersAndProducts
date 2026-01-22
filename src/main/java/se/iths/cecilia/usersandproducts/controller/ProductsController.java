package se.iths.cecilia.usersandproducts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.cecilia.usersandproducts.model.Product;

import java.util.List;

@Controller
public class ProductsController {
    @GetMapping
    public String productList(Model model) {
        List<Product> products = List.of(
                new Product("Kläder", 100.0F, "Vit tröja"),
                new Product("Kläder", 150.0F, "Svarta byxor")
        );
        model.addAttribute("product", products);
        return "product";
    }
}
