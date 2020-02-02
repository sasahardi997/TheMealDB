package com.myappcompany.hardi.themealdb.api;

import com.myappcompany.hardi.themealdb.model.Categories;
import com.myappcompany.hardi.themealdb.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodApi {

    @GET("random.php")
    Call<Meals> getMeal();

    @GET("categories.php")
    Call<Categories> getCategories();

}
