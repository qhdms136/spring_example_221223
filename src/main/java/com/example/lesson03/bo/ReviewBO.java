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
	
	// intput : review
	// output : int (성공한 행의 개수)
	public int addReview(Review review) {
		return reviewMapper.insertReview(review);
	}
	
	// addReviewAsField(4, "콤비네이션R", "마이켈", 5.0, "역시 맛있따!!");
	public int addReviewAsField(int storeId111, String menu111, String userName111,
			Double point111, String review111) {
		return reviewMapper.insertReviewAsField(storeId111, menu111, userName111, point111, review111);
	}
}
