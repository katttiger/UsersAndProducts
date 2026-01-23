package se.iths.cecilia.usersandproducts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import se.iths.cecilia.usersandproducts.service.ProductsService;

@Controller
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }

    @GetMapping("/product")
    public @ResponseBody String productList(Model model) {
        return productsService.ProductsServerServcie(model);
    }
}
