package com.exam.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
@RestController
public class FallbackController {
    @RequestMapping("/studentFallBack")
    public Mono<String> studentServiceFallBack() {
        return Mono.just("Studet Service is down. Please try again later");
    }
    @RequestMapping("/courseFallback")
    public Mono<String> courseServiceFallBack() {
        return Mono.just("Course Service is down. Please try again later");
    }
}
