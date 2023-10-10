package com.foodbox.restbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.foodbox.restbackend.model.Cuisine;
import com.foodbox.restbackend.repo.CuisineRepository;

@Service
@Transactional
public class CuisineService {
	
	
	private final CuisineRepository cuisineRepo;
	
	
	@Autowired
	public CuisineService(CuisineRepository cuisineRepo) {		
		this.cuisineRepo = cuisineRepo;
	}
	
	
	public List<Cuisine> findAllCuisines() {		
		return cuisineRepo.findAll();
	}
	
	public Cuisine addCuisine(Cuisine cuisine) {
		return cuisineRepo.save(cuisine);
	}

	public void updateCuisineProductCount(Cuisine cuisine, int newProductCount) {
		cuisine.setProductCount(newProductCount);		
	}

	public Cuisine updateCuisine(Cuisine cuisine) {
		return cuisineRepo.save(cuisine);
	}
	
	public Cuisine updateCuisine(Cuisine cuisine, Long id) {
		if(cuisine.getId() == id)
			return cuisineRepo.save(cuisine);
		return null;
	}

	
	public void deleteTag(Long id) {		
		cuisineRepo.deleteCuisineById(id);	
	}

}
