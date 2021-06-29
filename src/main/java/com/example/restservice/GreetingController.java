package com.example.restservice;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template="Hi %s!";
    private final AtomicLong counter=new AtomicLong();
    private List<String> listOfGreetings=new ArrayList<>();
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String deepHtml(){
        return "index.html";
    }

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "Hi this is deep shah") String name){
        listOfGreetings.add(String.format(template,name));
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
    @GetMapping("/home")
    public String getOutput(@RequestParam(value="name",defaultValue ="Deep shah") String name){

        return new String(String.format(template,name));
    }
    @GetMapping("/getallgreetings")
    public List<String> getAll(){

        return listOfGreetings;
    }

}
