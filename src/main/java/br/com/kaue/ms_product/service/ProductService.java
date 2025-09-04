package br.com.kaue.ms_product.service;

import br.com.kaue.ms_product.domain.Product;
import br.com.kaue.ms_product.dto.ProductDTO;
import br.com.kaue.ms_product.mapper.ProductMapper;
import br.com.kaue.ms_product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public void save(ProductDTO productDTO) {

        Product product = productMapper.dtoToEntity(productDTO);

        productRepository.save(product);

    }

}
