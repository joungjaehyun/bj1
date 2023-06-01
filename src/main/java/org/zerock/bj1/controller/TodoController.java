package org.zerock.bj1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@RequestMapping("/todo/")
@Log4j2
public class TodoController {
    

    @GetMapping("list")
    public void list(){
        log.info("list get.....");

    }
    @GetMapping("read/{tno}")
    public String read(@PathVariable("tno") Long tno){
        log.info("read get.....");

        return "/todo/read";

    }

    @GetMapping("add")
    public void add(){
        log.info("add get.........");
    }
    @PostMapping("add")
    public String addPost(){
        log.info("add post.......");

        return "redirect:/todo/list";
    }

    @GetMapping("modify/{tno}")
    public String modify(@PathVariable("tno") Long tno){

        log.info("modify get........");

        return "todo/modify";
    }
    @PostMapping("remove")
    public String removePost(){
        log.info("remove post.......");

        return "redirect:/todo/list";
    }

    @PostMapping("modify/{tno}")
    public String modifyPost(@PathVariable("tno")Long tno){
        log.info("modify post.......");

        return "redirect:/todo/read"+tno;
    }
}
