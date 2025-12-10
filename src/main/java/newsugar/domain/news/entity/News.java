package newsugar.domain.news.entity;

import jakarta.persistence.*;
import lombok.*;
import newsugar.domain.news.model.NewsCategory;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class News {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String url;

    private LocalDateTime publishedAt;

    @Enumerated(EnumType.STRING)
    private NewsCategory category;

    private LocalDateTime createdAt;
}
