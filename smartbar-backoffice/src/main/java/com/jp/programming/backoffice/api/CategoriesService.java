package com.jp.programming.backoffice.api;

import com.jp.programming.backoffice.api.model.Article;
import com.jp.programming.backoffice.api.model.Category;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoriesService {

    public Category get() {
        return new Category().name("drinks");
    }

    public static class ArticlesService {

        public Article get() {
            return new Article().name("Article 1");
        }
    }
}
