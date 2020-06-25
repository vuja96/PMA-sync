package com.ftn.PMA.controller;

import java.util.List;

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
	public void syncActivity(@RequestBody List<Activity> a) {
		for(Activity ac : a) {
			activityRepository.save(ac);
		}
	}
	
	@RequestMapping(value = "/syncActivityType", method = RequestMethod.POST)
	public void syncActivityType(@RequestBody List<ActivityType> acType) {
		for(ActivityType act : acType) {
			activityTypeRepository.save(act);
		}
	}
	
	@RequestMapping(value = "/syncDailySummary", method = RequestMethod.POST)
	public void syncDailySummary(@RequestBody List<DailySummary> daily) {
		for(DailySummary ds : daily) {
			dailyRepository.save(ds);
		}
	}
	
	@RequestMapping(value = "/syncGrocery", method = RequestMethod.POST)
	public void syncGrocery(@RequestBody List<Grocery> grocery) {
		for(Grocery g : grocery) {
			groceryRepository.save(g);
		}
	}
	
	@RequestMapping(value = "/syncGroceryAndAmount", method = RequestMethod.POST)
	public void syncGroceryAndAmount(@RequestBody List<GroceryAndAmountPair> grocery) {
		for(GroceryAndAmountPair g : grocery) {
			groceryAndAmountRepository.save(g);
		}
	}
	
	@RequestMapping(value = "/syncLocation", method = RequestMethod.POST)
	public void syncLocation(@RequestBody List<Location> location) {
		for(Location l : location) {
			locationRepository.save(l);
		}
	}
	
	@RequestMapping(value = "/syncMeal", method = RequestMethod.POST)
	public void syncMeal(@RequestBody List<Meal> meal) {
		for(Meal m : meal) {
			mealRepository.save(m);
		}
	}
	
	@RequestMapping(value = "/syncUser", method = RequestMethod.POST)
	public void syncUser(@RequestBody List<User> user) {
		for(User u : user) {
			userRepository.save(u);
		}
	}
	
}
