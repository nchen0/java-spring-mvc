package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    // need a contorller method to show the initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the HTML form after
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // new controller method to read form data and
    // add data to the model
    @RequestMapping("/processFormTwo")
    public String letsShout(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        request.getParameter()

        // convert the data to all caps

        // create the message

        // add message to the model
        return "helloworld";
    }

}
