package br.com.kaue.ms_product.controller;

import br.com.kaue.ms_product.constants.ProductConstants;
import br.com.kaue.ms_product.dto.ProductDTO;
import br.com.kaue.ms_product.dto.ResponseDTO;
import br.com.kaue.ms_product.service.ProductService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> save(@Valid @RequestBody ProductDTO productDTO) {
        productService.save(productDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(
                ResponseDTO.builder()
                        .message(ProductConstants.PRODUCT_201_MESSAGE)
                        .statusHttp(ProductConstants.PRODUCT_201_STATUS)
                        .build());
    }

}
