package com.purcell.service;

import com.purcell.entity.Article;
import java.util.List;

public interface IArticleService {
    List<Article> getAllArticles();
    Article getArticleById(long articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(int articleId);
}
