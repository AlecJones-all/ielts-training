package com.example.ieltstraining.controller

import com.example.ieltstraining.common.Result
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController //这个类是一个接口类
@RequestMapping("/api") //这个类下面的接口都以 /api 开头
class HealthController {

    @GetMapping("/health") //这个方法处理 GET /health 请求  -> /api + /health = /api/health
    fun health(): Result<String> {
        return Result.success("Kotlin IELTS Training System is running")
    }
}