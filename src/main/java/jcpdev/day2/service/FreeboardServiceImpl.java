package jcpdev.day2.service;

import org.springframework.stereotype.Component;

import jcpdev.day2.dto.BoardDto;
import jcpdev.day2.mapper.FreeboardMapper;

@Component
public class FreeboardServiceImpl implements FreeboardService{
	
	private final FreeboardMapper freeDao;
	
	//@Autowired //생성자 자동주입
	public FreeboardServiceImpl(FreeboardMapper freeDao) {
		this.freeDao= freeDao;
	}
	public int getCount() {
		return freeDao.getCount();
	}

	public BoardDto getBoardOne(int idx) {
		return freeDao.getBoardOne(idx);
	}
	
}
