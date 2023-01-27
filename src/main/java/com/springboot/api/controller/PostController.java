package com.springboot.api.controller;

import com.springboot.api.dto.CommonRespDto;
import com.springboot.api.util.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @PostMapping(value = "/postReqeust")
    public ResponseEntity<CommonRespDto> postRequest1() throws Exception {

        CommonRespDto commonRespDto = new CommonRespDto();
        commonRespDto.setResultCd("0000");
        commonRespDto.setResultMsg("정상처리");
        commonRespDto.setResultCd(DateUtil.getNowDateYYYYMMDDHHMMSS());

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(commonRespDto);
    }

}
