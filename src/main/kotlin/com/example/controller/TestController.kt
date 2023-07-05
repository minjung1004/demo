package com.example.controller

import com.example.model.UserRequest
import com.example.model.UserResponse
import io.micronaut.http.annotation.*
import io.micronaut.http.annotation.Controller

@Controller("/test")
class TestController {

    @Post
    fun postTest(@Body request: UserRequest) : UserResponse{
        val firstname = request.first_name
        val lastname = request.last_name
        val fullname = "$firstname $lastname"

        val response = UserResponse(firstname, lastname, fullname)
        return response
    }

    @Get
    fun getTest() : UserResponse{
        val response = UserResponse("xyz","test","xyz test")
        return response
    }



}
