package kr.happyjob.study.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.service.HomeService;
import kr.happyjob.study.vo.HomeModel;

//import kr.happyjob.study.vo.system.CommcodeModel;

@Controller
@RequestMapping("/system")
public class HomeController {

	// Set logger
	private final Logger logger = LogManager.getLogger(this.getClass());
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/listHomeData")
	@ResponseBody
	public Map<String, Object> listHomeData(@RequestParam Map<String, Object> paramMap) throws Exception {

	    logger.info("+ Start homecontroller.listHomeData");
	    
	    Map<String, Object> resultMap = new HashMap<String, Object>();
 
		try {
			List<HomeModel> homeModel = homeService.listHomeData(paramMap);
			
			logger.info("homeModel :::"+ homeModel);
			
			resultMap.put("homeModel", homeModel);
			resultMap.put("result", "SUCCESS");
			
			 logger.info("SUCCESS");
			
		} catch (Exception e) {
			
			resultMap.put("result", "FAIL");
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			logger.info("FAIL");
		}
	  
	    logger.info("+ End Commcodecontroller.listHomeData");
	    
	    return resultMap;
   }
	
}
