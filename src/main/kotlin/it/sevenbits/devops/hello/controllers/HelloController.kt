package it.sevenbits.devops.hello.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
open class HelloController {

    @RequestMapping("/api/hello")
    @ResponseBody
    open fun hello(
        @RequestParam(value="name", defaultValue="World") name: String
    ): String {
        return "Hello, $name!\n"
    }

}
