package com.springboot.api.controller;

import com.springboot.api.dto.ApiPostRequestExDto;
import com.springboot.api.dto.CommonRespDto;
import com.springboot.api.util.DateUtil;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    private final Logger logger = LoggerFactory.getLogger(PostController.class);

    @PostMapping(value = "/postReqeust")
    @ApiOperation(value = "POST 메소드 예제", notes = "ResponseEntity 예제")
    public ResponseEntity<CommonRespDto> postRequest1(@Valid @RequestBody ApiPostRequestExDto apiPostRequestExDto) throws Exception {

        logger.info("POST 메소드 예제 호출");
        logger.info("시간 : " + DateUtil.getNowDateYYYYMMDDHHMMSS());

        CommonRespDto commonRespDto = new CommonRespDto();
        commonRespDto.setResultCd("0000");
        commonRespDto.setResultMsg("정상처리");
        commonRespDto.setResultDate(DateUtil.getNowDateYYYYMMDDHHMMSS());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(commonRespDto);
    }

}
