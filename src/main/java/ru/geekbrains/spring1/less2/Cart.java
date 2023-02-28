package ru.geekbrains.spring1.less2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private ProductService productService;
    private List<Product> products;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @PostConstruct
    private void init(){
        products = new ArrayList<>();
    }

    public void addProductById(Long id){
        products.add(productService.findById(id));
    }

    public void removeProductById(Long id){
        products.remove(productService.findById(id));
    }

    public List<Product> findAll(){
        return productService.findAll();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < products.size() ; i++) {
            sb.append(products.get(i));
        }
        sb.append("]");
        return sb.toString();
    }
}
