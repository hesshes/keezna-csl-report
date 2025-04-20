package com.keezna.csl.report.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/report")
public class ReportController {

    @PostMapping("/test1")
    public String postMethodName(@RequestBody String entity) {
        log.info("==============================");
        return entity;
    }

}
