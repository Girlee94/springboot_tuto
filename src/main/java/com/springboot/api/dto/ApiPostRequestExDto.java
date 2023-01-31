package com.springboot.api.dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ApiPostRequestExDto {

    @ApiParam(value = "요청자 이름", required = true)
    @NotBlank
    private String requestName;
}
