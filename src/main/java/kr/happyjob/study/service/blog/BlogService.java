package kr.happyjob.study.service.blog;

import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.model.blog.BlogReqVO;
import kr.happyjob.study.repository.blog.BlogDAO;

@Service
public class BlogService {

	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();

	@Autowired
	private BlogDAO blogMapper;


	public int insertblogreq(Map<String, Object> paramMap) throws Exception {
		return blogMapper.insertblogreq(paramMap);
	}
	

}