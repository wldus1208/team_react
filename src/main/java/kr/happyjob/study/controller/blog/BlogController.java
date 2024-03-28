package kr.happyjob.study.controller.blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.model.blog.BlogReqVO;
import kr.happyjob.study.service.blog.BlogService;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());

	// Get class name for logger
	private final String className = this.getClass().toString();
	   
	
	@Autowired
	private BlogService blogservice;

	   	
	@RequestMapping("/insertblogreq")
	@ResponseBody
	public Map<String, Object> insertblogreq(Model model, @RequestParam Map<String, Object> paramMap, HttpServletRequest request,
	         HttpServletResponse response, HttpSession session) throws Exception {

	      logger.info("+ Start Blogcontroller.insertblogreq");
		  logger.info("   - ParamMap : " + paramMap);
		    
		  String result;
		  String resultMsg;
		  Map<String, Object> resultMap = new HashMap<String, Object>();
		  
		  String action = (String) paramMap.get("action");
		  //paramMap.put("loginid",(String)session.getAttribute("loginId"));
		  
		  try {
			  blogservice.insertblogreq(paramMap);
//			  if("I".equals(action)) {
//				  blogservice.insertblogreq(paramMap);
//			  } else if("U".equals(action)) {
//				  //blogservice.updategroupcode(paramMap);				  
//			  } else if("D".equals(action)) {
//				  //blogservice.deletegroupcode(paramMap);
//			  }

		      resultMap.put("result", "SUCCESS");
	  
		  } catch (Exception e) {
			  resultMap.put("result", "FAIL");
			  resultMap.put("resultmsg", e.getMessage());
		  }	  
	  
	  
	    logger.info("+ End Blogcontroller.insertblogreq");

	    return resultMap;
    }

}