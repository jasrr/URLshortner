package com.controller;

import com.model.BitLyRequest;
import com.service.BitlyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/api/v1")
public class BitlyRestController  {

    @Autowired
    BitlyService bitlyService;

    @PostMapping("processBitly")
    public String processBitly(@RequestBody BitLyRequest bitlyRequest){

        String shortURL = bitlyService.getShortURL(bitlyRequest.getLongURL());
        return shortURL;

    }

}
