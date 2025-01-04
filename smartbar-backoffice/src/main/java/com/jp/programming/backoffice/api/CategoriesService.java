package com.jp.programming.backoffice.api;

import com.jp.programming.backoffice.model.Category;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoriesService {

    public Category get() {
        return new Category().name("drinks");
    }
}
