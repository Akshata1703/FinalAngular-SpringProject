package com.foodbox.restbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.foodbox.restbackend.model.Tag;

import com.foodbox.restbackend.repo.TagsRepository;

@Service
@Transactional
public class TagsService {
	
	
	private final TagsRepository tagsRepo;	
	
	
	@Autowired
	public TagsService(TagsRepository tagsRepo) {		
		this.tagsRepo = tagsRepo;
		
	}
	
	
	public List<Tag> findAllTags() {		
		return tagsRepo.findAll();
	}
	
	public Tag addTags(Tag tag) {
		return tagsRepo.save(tag);
	}	

	public void updateTagProductCount(Tag tag, int newProductCount) {		
		tag.setProductCount(newProductCount);		
	}

	public Tag updateTag(Tag tag) {
		return tagsRepo.save(tag);
	}
	
	public Tag updateTag(Tag tag, Long id) {		
		if(tag.getId() == id)
			return tagsRepo.save(tag);
		return null;
	}

	
	public void deleteTag(Long id) {
		tagsRepo.deleteTagById(id);		
	}

}
