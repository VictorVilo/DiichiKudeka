/*-----------------------------------------------------------------------------
 - Developed by Haerul Muttaqin                                               -
 - Last modified 3/24/19 3:33 AM                                              -
 - Subscribe : https://www.youtube.com/haerulmuttaqin                         -
 - Copyright (c) 2019. All rights reserved                                    -
 -----------------------------------------------------------------------------*/
package com.planner.diichi.view.category;

import com.planner.diichi.model.Meals;

import java.util.List;

public interface CategoryView {
    void showLoading();

    void hideLoading();

    void setMeals(List<Meals.Meal> meals);

    void onErrorLoading(String message);
}
