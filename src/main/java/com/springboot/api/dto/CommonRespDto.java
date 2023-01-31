package com.springboot.api.dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class CommonRespDto {

    @ApiParam(value = "결과코드")
    private String resultCd;

    @ApiParam(value = "결과메시지")
    private String resultMsg;

    @ApiParam(value = "결과응답날짜")
    private String resultDate;

}
