package com.jp.programming.backoffice.api;

import com.jp.programming.backoffice.model.Category;
import io.smallrye.common.annotation.NonBlocking;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

@NonBlocking
public class CategoriesResource implements CategoriesApi {
    private final Category category = new Category().name("drinks");


    @Override
    public Response categoriesCategoryIdDelete(Integer categoryId) {
        return Response.ok().build();
    }

    @Override
    public Response categoriesCategoryIdGet(Integer categoryId) {
        return Response.ok(category).build();
    }

    @Override
    public Response categoriesCategoryIdPut(Integer categoryId, Category category) {
        return Response.ok().build();
    }

    @Override
    public Response createCategory(Category category) {
        return Response.created(URI.create("todo")).build();
    }

    @Override
    public Response getCategories() {
        return Response.ok(List.of(category)).build();
    }
}
