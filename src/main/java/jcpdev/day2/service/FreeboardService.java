package jcpdev.day2.service;

import jcpdev.day2.dto.BoardDto;

public interface FreeboardService {
	//메소드 이름은 임의로 정의 가능. 하지만 mapper와 메소드 이름을 통일하는게 편합니다.
	int getCount();
	BoardDto getBoardOne(int idx);
	
}
