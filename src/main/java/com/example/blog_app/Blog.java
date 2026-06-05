package com.example.blog_app;

import java.time.LocalDateTime;
//dataclass
public class Blog {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    //コンストラクター
    public Blog(Long id,String title,String content,LocalDateTime createdAt){
        this.title = title;
        this.content = content;
        this.id = id;
        this.createdAt = createdAt;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
}
