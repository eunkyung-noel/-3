<<<<<<< HEAD
package newsugar.domain.news.repository;

import jakarta.persistence.*;
import lombok.*;
=======
package newsugar.domain.news.entity;

import jakarta.persistence.;
import lombok.;
>>>>>>> 153ad2c1636646ab304f63fe9f8b08017de6fee9
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
<<<<<<< HEAD
    @JoinColumn(name = "news_id")
    private News news;
}
=======
    private News news;
}
>>>>>>> 153ad2c1636646ab304f63fe9f8b08017de6fee9
