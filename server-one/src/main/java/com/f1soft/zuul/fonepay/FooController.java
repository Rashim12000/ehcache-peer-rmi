package com.f1soft.zuul.fonepay;


import com.f1soft.zuul.fonepay.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Rashim Dhaubanjar
 */
@Slf4j
@RestController
public class FooController {

    @Autowired
    private CacheManager cacheManager;

    @GetMapping("/cahce/get")
    public Result findById(HttpServletRequest req, HttpServletResponse res) {

        String value = (String) cacheManager.getCache("events").get("test").get();
        return new Result(1L, value);
    }

    @GetMapping("/cache/set/{value}")
    public Result findById(@PathVariable String value, HttpServletRequest req, HttpServletResponse res) {
        log.info("received get merchants");

        cacheManager.getCache("events").put("test", value);

        return new Result(1L, "Esewa");
    }

}
