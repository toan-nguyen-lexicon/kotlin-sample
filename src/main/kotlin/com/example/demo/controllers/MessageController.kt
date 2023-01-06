package com.example.demo.controllers

import com.example.demo.integrate.EntryList
import com.example.demo.integrate.PublicApi
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("message")
class MessageController(val publicApi: PublicApi) {

    @GetMapping("")
    fun index(): EntryList? {
        return publicApi.getListApi()
    }
}