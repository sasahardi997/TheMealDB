package com.myappcompany.hardi.themealdb.view.home;

import com.myappcompany.hardi.themealdb.model.Categories;
import com.myappcompany.hardi.themealdb.model.Meals;

import java.util.List;

public interface HomeView {

    void showLoading();
    void hideLoading();
    void setMeal(List<Meals.Meal> meal);
    void setCategory(List<Categories.Category> category);
    void onErrorLoading(String message);

}
