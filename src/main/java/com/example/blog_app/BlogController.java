package com.example.blog_app;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogController {
    private final BlogRepository blogRepository;
    public BlogController(BlogRepository blogRepository){
        this.blogRepository = blogRepository;
    }
    @GetMapping("/")
    public String blogs(Model model) {
        // List<Blog> blogs = List.of(
        //     new Blog("映画", "感想"),
        //     new Blog("研修", "感想"));
        System.out.println("DEから取得します");
        model.addAttribute("blogs",blogRepository.findAll());
        return "blogs";
    }
}
