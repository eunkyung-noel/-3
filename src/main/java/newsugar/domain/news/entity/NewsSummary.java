package newsugar.domain.news.entity;

<<<<<<< HEAD
import jakarta.persistence.*;
import lombok.*;
import newsugar.domain.news.entity.News;

@Entity
@Table(name = "summary")
@Getter
@Setter
=======
import jakarta.persistence.;
import lombok.;
import newsugar.domain.news.model.News;

@Entity
@Table(name = "summary")
@Getter @Setter
>>>>>>> 153ad2c1636646ab304f63fe9f8b08017de6fee9
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NewsSummary {

<<<<<<< HEAD
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> 153ad2c1636646ab304f63fe9f8b08017de6fee9
    private Long id;

    @Column(length = 2000)
    private String summaryText;

    @OneToOne
    @JoinColumn(name = "news_id")
    private News news;
<<<<<<< HEAD
}
=======
}
>>>>>>> 153ad2c1636646ab304f63fe9f8b08017de6fee9
