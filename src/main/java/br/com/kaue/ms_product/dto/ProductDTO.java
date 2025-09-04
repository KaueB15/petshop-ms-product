package br.com.kaue.ms_product.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ProductDTO {

    @NotBlank
    @Size(min = 5, max = 60)
    private String description;

    private BigDecimal price;

    @NotBlank
    @Size(min = 2, max = 60)
    private String maker;

}
