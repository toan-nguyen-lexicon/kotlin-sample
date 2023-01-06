package com.example.demo.integrate

import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class PublicApi {
    private val entriesUrl = "https://api.publicapis.org/entries"
    private val restTemplate: RestTemplate = RestTemplate()

    fun getListApi(): EntryList? {
        return restTemplate.getForEntity(entriesUrl, EntryList::class.java).body
    }
}