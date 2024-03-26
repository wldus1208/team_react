package kr.happyjob.study.repository.blog;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BlogDAO {

	public int insertblogreq(Map<String, Object> paramMap);

	
}