package com.example.blog_app;

import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    public void add(BlogForm form) {
        if (form.getTitle() == null || form.getTitle().isBlank()) {
            throw new IllegalArgumentException();
        }
        Blog blog = new Blog(form.getTitle(), form.getContent());
        blogRepository.save(blog);
    }
}