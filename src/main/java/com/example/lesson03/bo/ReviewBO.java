package com.example.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson03.dao.ReviewMapper;
import com.example.lesson03.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewMapper reviewMapper;	// null 일 수 가없다.
	
	// input: X
	// output: <Review>
	public Review getReview(int id) {
		return reviewMapper.selectReview(id);
	}
}
