package com.example.web.dto;

import com.example.domain.posts.Posts;
import com.example.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public Posts toEntity(User writer) {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .writer(writer)
                .build();
    }
}
