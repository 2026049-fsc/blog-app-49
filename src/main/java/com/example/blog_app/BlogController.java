package com.example.blog_app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class BlogController {
    private final BlogService blogService;
    public BlogController(BlogService blogService){
        this.blogService = blogService;
    }
    @GetMapping("/")
    public String blogs(Model model) {
        // List<Blog> blogs = List.of(
        //     new Blog("映画", "感想"),
        //     new Blog("研修", "感想"));
        System.out.println("DBから取得します");
        model.addAttribute("blogs",blogService.findAll());
        return "blogs";
    }
    @PostMapping("/blogs")
    public String add(@ModelAttribute  BlogForm form) {
        //TODO: process POST request
        blogService.add(form);
        return "redirect:/";
    }
    @GetMapping("/blogs/new")
    public String newblog() {
        return "/blogs/new";
    }
}
