package com.ftn.PMA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("")
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
	public ResponseEntity<List<Activity>> syncActivity(@RequestBody List<Activity> a) {
		boolean tmp = false;
		for(Activity ac : a) {
			Activity result = activityRepository.save(ac);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/syncActivityType", method = RequestMethod.POST)
	public ResponseEntity<List<ActivityType>> syncActivityType(@RequestBody List<ActivityType> acType) {
		boolean tmp = false;
		for(ActivityType act : acType) {
			ActivityType result = activityTypeRepository.save(act);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/syncDailySummary", method = RequestMethod.POST)
	public ResponseEntity<List<DailySummary>> syncDailySummary(@RequestBody List<DailySummary> daily) {
		boolean tmp = false;
		for(DailySummary ds : daily) {
			DailySummary result = dailyRepository.save(ds);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/syncGrocery", method = RequestMethod.POST)
	public ResponseEntity<List<Grocery>> syncGrocery(@RequestBody List<Grocery> grocery) {
		boolean tmp = false;
		for(Grocery g : grocery) {
			Grocery result = groceryRepository.save(g);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/syncGroceryAndAmount", method = RequestMethod.POST)
	public ResponseEntity<List<GroceryAndAmountPair>> syncGroceryAndAmount(@RequestBody List<GroceryAndAmountPair> grocery) {
		boolean tmp = false;
		for(GroceryAndAmountPair g : grocery) {
			GroceryAndAmountPair result = groceryAndAmountRepository.save(g);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/syncLocation", method = RequestMethod.POST)
	public ResponseEntity<List<Location>> syncLocation(@RequestBody List<Location> location) {
		boolean tmp = false;
		for(Location l : location) {
			Location result = locationRepository.save(l);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/syncMeal", method = RequestMethod.POST)
	public ResponseEntity<List<Meal>> syncMeal(@RequestBody List<Meal> meal) {
		boolean tmp = false;
		for(Meal m : meal) {
			Meal result = mealRepository.save(m);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/syncUser", method = RequestMethod.POST)
	public ResponseEntity<List<User>> syncUser(@RequestBody List<User> user) {
		boolean tmp = false;
		for(User u : user) {
			User result = userRepository.save(u);
			if(result == null)
				tmp = true;
		}
		if(tmp == false)
			return new ResponseEntity<>(HttpStatus.OK);
		else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
}
