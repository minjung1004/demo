package com.example.controller

import com.example.model.UserRequest
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

//unit test for TestController.kt
//requirement is post firstname, lastname, fullname
class TestControllerSpec : FunSpec({
//    test("first testing extact naming"){
//        val testController = TestController().postTest(request = UserRequest("xyz", "test"))
//        testController.first_name shouldBeEqualIgnoringCase("xyz")
//        testController.last_name shouldBeEqualIgnoringCase("test")
//        testController.full_name shouldBeEqualIgnoringCase("xyz test")
//    }
    test("test: first, last, and full name"){
        val testController = TestController().postTest(UserRequest("",""))
        testController.first_name shouldNotBe null
        testController.last_name shouldNotBe null
        testController.full_name shouldNotBe null
    }

})


