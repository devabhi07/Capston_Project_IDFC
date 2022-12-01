package com.foodapp.service;

import java.util.List;

import com.foodapp.model.Comment;
import com.foodapp.model.Dish;
import com.foodapp.model.Restaurant;
import com.foodapp.model.RestaurantInfo;

public interface RestaurantService {

  int addDish(String id, Dish dish);

  int removeDish(String id, Dish dish);

  List<Dish> getAllDishes(String id);

  RestaurantInfo getInformation(String id);

  int updateInfo(String id, RestaurantInfo info);
}
