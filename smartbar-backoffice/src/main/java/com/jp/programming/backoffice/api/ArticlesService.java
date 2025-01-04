package com.jp.programming.backoffice.api;

import com.jp.programming.backoffice.model.Article;

public class ArticlesService {

    public Article get() {
        return new Article().name("Article 1");
    }
}
