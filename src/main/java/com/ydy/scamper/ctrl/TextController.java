package com.ydy.scamper.ctrl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yoyo on 2019/7/18.
 */
@RestController
@RequestMapping("/test")
@Slf4j
@Validated
public class TextController {


    @RequestMapping("/showParam")
    public String[] showParam(){

       return null;


    }




}
