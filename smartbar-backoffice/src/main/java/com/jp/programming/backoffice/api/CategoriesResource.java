package com.jp.programming.backoffice.api;

import io.smallrye.common.annotation.NonBlocking;
import jakarta.ws.rs.core.Response;

import java.util.List;

@NonBlocking
public class CategoriesResource implements CategoriesApi {

    private final CategoriesService categoriesService;

    public CategoriesResource(CategoriesService categoriesService) {
        this.categoriesService = categoriesService;
    }


    @Override
    public Response categoriesCategoryIdDelete(Integer categoryId) {
        return Response.ok().build();
    }

    @Override
    public Response categoriesCategoryIdGet(Integer categoryId) {
        return Response.ok(categoriesService.get()).build();
    }

    @Override
    public Response categoriesCategoryIdPut(Integer categoryId, com.jp.programming.backoffice.api.model.Category category) {
        return null;
    }

    @Override
    public Response createCategory(com.jp.programming.backoffice.api.model.Category category) {
        return null;
    }

    @Override
    public Response getCategories() {
        return Response.ok(List.of(categoriesService.get())).build();
    }
}
