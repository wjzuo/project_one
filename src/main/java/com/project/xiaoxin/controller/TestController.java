package com.project.xiaoxin.controller;

import com.project.xiaoxin.common.BaseController;
import com.project.xiaoxin.common.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Slf4j
public class TestController extends BaseController {

    @GetMapping
    public ResponseResult<Void> test(){
        log.info("hello, this is test");
        return ResponseResult.success(null);
    }
}
