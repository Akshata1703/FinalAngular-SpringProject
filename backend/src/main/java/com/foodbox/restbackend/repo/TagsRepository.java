package com.foodbox.restbackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbox.restbackend.model.Tag;


public interface TagsRepository extends JpaRepository<Tag, Long>{
	void deleteTagById(Long id);
	


}
