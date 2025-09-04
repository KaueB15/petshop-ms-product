package br.com.kaue.ms_product.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResponseDTO {

    private String message;

    private String statusHttp;

}
