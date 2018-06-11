package com.purcell.respository;

import com.purcell.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by e026459 on 6/11/2018.
 */
public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findByTitle(String title);
    List<Article> findDistinctByCategory(String category);
    List<Article> findByTitleAndCategory(String title, String category);

}