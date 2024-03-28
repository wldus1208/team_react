package kr.happyjob.study.controller.login;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.happyjob.study.model.login.LoginVO;
import kr.happyjob.study.service.login.LoginService;
import kr.happyjob.study.service.login.LoginService2;

@Controller
public class LoginController {

	@Resource(name = "loginService")
	private LoginService loginService;

	@Autowired
	private LoginService2 loginService2;

	// 회원가입 등록
	@PostMapping("/register.do")
	@ResponseBody
	public Map<String, Object> registerGo(Model model, @RequestParam Map<String, Object> paramMap,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		Map<String, Object> resMap = new HashMap<String, Object>();

		System.out.println(paramMap);

		try {
			loginService2.registerGo(paramMap);

			resMap.put("result", "SUCCESS");
		} catch (Exception e) {
			e.printStackTrace();
			resMap.put("result", "FAIL");
		}	

		return resMap;
	}

	// 로그인
	@PostMapping("/login.do")
	@ResponseBody
	public Map<String, Object> loginGo(Model model, @RequestParam Map<String, Object> paramMap,
			HttpServletRequest request, HttpServletResponse response, HttpSession session) throws Exception {

		Map<String, Object> resMap = new HashMap<String, Object>();
		
		try {
			LoginVO loginVO = loginService2.loginGo(paramMap);
			
			if(loginVO != null) {
				
				// 세션에 로그인 정보 저장
				session.setAttribute("loginId", loginVO.getLoginid());
				session.setAttribute("name", loginVO.getName());
				session.setAttribute("email", loginVO.getEmail());
				
				resMap.put("loginId", loginVO.getLoginid());
				resMap.put("name", loginVO.getName());
				resMap.put("email", loginVO.getEmail());
				resMap.put("result", "SUCCESS");
				resMap.put("resultMsg", "로그인 성공");
			} else {
				resMap.put("result", "FAIL");
				resMap.put("resultMsg", "로그인 정보가 일치하지 않습니다.");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(resMap);
		return resMap;
	}
	
	// 로그아웃
//	@RequestMapping(value = "/logout.do")
//	public ModelAndView loginOut(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
//		
//		ModelAndView mv = new ModelAndView();
//		session.invalidate();
//		mv.setViewName("redirect:/login");
//		
//		return mv;
//	}

}
