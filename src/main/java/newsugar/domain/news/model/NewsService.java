package newsugar.domain.news.service;

import lombok.RequiredArgsConstructor;
import newsugar.domain.news.dto.NewsDto;
import newsugar.domain.news.repository.NewsRepository;
import newsugar.domain.news.entity.News;
import newsugar.domain.news.dto.NewsResponse;
import newsugar.domain.news.model.NewsCategory;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsService {

    private final RSSService rssService;
    private final NewsRepository newsRepository;

    public void refreshNews(String rssUrl) {

        List<NewsDto> dtoList = rssService.fetchRss(rssUrl);

        for (NewsDto dto : dtoList) {
            News news = News.builder()
                    .title(dto.title())
                    .content(dto.content())
                    .url(dto.link())
                    .category(dto.category())
                    .build();

            newsRepository.save(news);
        }
    }

    public void refreshNews(NewsCategory category, String rssUrl) {
        List<NewsDto> dtoList = rssService.fetchRss(rssUrl);
        for (NewsDto dto : dtoList) {
            News news = News.builder()
                    .title(dto.title())
                    .content(dto.content())
                    .url(dto.link())
                    .category(dto.category())
                    .build();
            newsRepository.save(news);
        }
    }

    public List<NewsResponse> getLatestNews() {
        return newsRepository.findTop20ByOrderByPublishedAtDesc()
                .stream()
                .map(NewsResponse::from)
                .collect(Collectors.toList());
    }

    public List<NewsResponse> getNewsByCategory(NewsCategory category) {
        return newsRepository.findByCategoryOrderByPublishedAtDesc(category)
                .stream()
                .map(NewsResponse::from)
                .collect(Collectors.toList());
    }
}