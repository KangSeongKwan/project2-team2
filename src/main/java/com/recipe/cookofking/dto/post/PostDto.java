package com.recipe.cookofking.dto.post;

import com.recipe.cookofking.dto.UserDto;
import com.recipe.cookofking.entity.Post;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Post}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostDto implements Serializable {
    Integer id;
    UserDto user;
    String title;
    String content;
    String ingredients;
    String instructions;
    String mainImageS3URL;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;
}