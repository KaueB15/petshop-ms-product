package br.com.kaue.ms_product.repository;

import br.com.kaue.ms_product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
