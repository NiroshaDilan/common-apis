package lk.icoder.commonapis.service;

import lk.icoder.commonapis.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> listAll();

    void save(Product product);

    Product get(Integer id);

    void delete(Integer id);
}
