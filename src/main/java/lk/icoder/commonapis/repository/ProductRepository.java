package lk.icoder.commonapis.repository;

import lk.icoder.commonapis.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
