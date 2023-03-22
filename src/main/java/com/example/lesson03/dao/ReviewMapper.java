package com.example.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.lesson03.model.Review;

@Repository
public interface ReviewMapper {
	
	public Review selectReview(@Param("id") int id);
	
	public int insertReview(Review review);
	
	// @Param이 있기 때문에 하나의 맵이 xml로 넘어간다.
	public int insertReviewAsField(
			// @Param 명은 중요하다 함부로 마음대로 x
			// 나머지 변수 명은 마음대로 
			@Param("storeId") int storeId1234, 
			@Param("menu") String menu1234, 
			@Param("userName") String userName1234,
			@Param("point") Double point1234, 
			@Param("review") String review1234);
}
