package br.com.kaue.ms_product.mapper;

import br.com.kaue.ms_product.domain.Product;
import br.com.kaue.ms_product.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface ProductMapper {

    Product dtoToEntity(ProductDTO productDTO);

    ProductDTO entityToDto(Product product);

}
