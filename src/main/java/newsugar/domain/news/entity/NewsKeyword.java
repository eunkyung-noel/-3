package newsugar.domain.news.repository;

import jakarta.persistence.*;
import lombok.*;
import newsugar.domain.news.entity.News;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewsKeyword {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String keyword;

    @ManyToOne
    @JoinColumn(name = "news_id")
    private News news;
}
