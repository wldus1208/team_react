package kr.happyjob.study.service.blog;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.blog.BlogDAO;

@Service
public class BlogService {

	@Autowired
	private BlogDAO blogDao;


	public int insertblogreq(Map<String, Object> paramMap) throws Exception {
		return blogDao.insertblogreq(paramMap);
	}
	

}