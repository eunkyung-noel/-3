package newsugar.domain.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import newsugar.domain.news.entity.News;
import newsugar.domain.news.model.NewsCategory;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Long> {

    List<News> findTop20ByOrderByPublishedAtDesc();

    List<News> findByCategoryOrderByPublishedAtDesc(NewsCategory category);
}
