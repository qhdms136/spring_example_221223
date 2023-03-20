package com.example.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson02.dao.UsedGoodsMapper;
import com.example.lesson02.model.UsedGoods;

@Service
public class UsedGoodsBO {
	
	@Autowired		// DI(Dependency Injection): spring container에 있는 spring bean을 주입한다.
	private UsedGoodsMapper usedGoodsMapper;
	
	//	input :	X	파라미터
	// output : List<UsedGoods> 리턴타입
	public List<UsedGoods> getUsedGoodsList(){
		List<UsedGoods> usedGoodsList = usedGoodsMapper.selectUsedGoodsList();
		return usedGoodsList;
	}
}
