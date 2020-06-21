package com.ftn.PMA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ftn.PMA.model.Activity;
import com.ftn.PMA.model.ActivityType;
import com.ftn.PMA.model.DailySummary;
import com.ftn.PMA.model.Grocery;
import com.ftn.PMA.model.GroceryAndAmountPair;
import com.ftn.PMA.model.Location;
import com.ftn.PMA.model.Meal;
import com.ftn.PMA.model.User;
import com.ftn.PMA.repository.ActivityRepository;
import com.ftn.PMA.repository.ActivityTypeRepository;
import com.ftn.PMA.repository.DailySummaryRepository;
import com.ftn.PMA.repository.GroceryAndAmountPairRepository;
import com.ftn.PMA.repository.GroceryRepository;
import com.ftn.PMA.repository.LocationRepository;
import com.ftn.PMA.repository.MealRepository;
import com.ftn.PMA.repository.UserRepository;

@RestController
@RequestMapping("/")
public class SyncController {

	@Autowired
	ActivityRepository activityRepository;
	
	@Autowired
	ActivityTypeRepository activityTypeRepository;
	
	@Autowired
	DailySummaryRepository dailyRepository;
	
	@Autowired
	GroceryRepository groceryRepository;
	
	@Autowired
	GroceryAndAmountPairRepository groceryAndAmountRepository;
	
	@Autowired
	LocationRepository locationRepository;
	
	@Autowired
	MealRepository mealRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(value = "/syncActivity", method = RequestMethod.POST)
	public void syncActivity(@RequestBody Activity a) {
		activityRepository.save(a);
	}
	
	@RequestMapping(value = "/syncActivityType", method = RequestMethod.POST)
	public void syncActivityType(@RequestBody ActivityType acType) {
		activityTypeRepository.save(acType);
	}
	
	@RequestMapping(value = "/syncDailySummary", method = RequestMethod.POST)
	public void syncDailySummary(@RequestBody DailySummary daily) {
		dailyRepository.save(daily);
	}
	
	@RequestMapping(value = "/syncGrocery", method = RequestMethod.POST)
	public void syncGrocery(@RequestBody Grocery grocery) {
		groceryRepository.save(grocery);
	}
	
	@RequestMapping(value = "/syncGroceryAndAmount", method = RequestMethod.POST)
	public void syncGroceryAndAmount(@RequestBody GroceryAndAmountPair grocery) {
		groceryAndAmountRepository.save(grocery);
	}
	
	@RequestMapping(value = "/syncLocation", method = RequestMethod.POST)
	public void syncLocation(@RequestBody Location location) {
		locationRepository.save(location);
	}
	
	@RequestMapping(value = "/syncMeal", method = RequestMethod.POST)
	public void syncMeal(@RequestBody Meal meal) {
		mealRepository.save(meal);
	}
	
	@RequestMapping(value = "/syncUser", method = RequestMethod.POST)
	public void syncUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
}
