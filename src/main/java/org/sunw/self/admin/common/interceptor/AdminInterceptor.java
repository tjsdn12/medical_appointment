package org.sunw.self.admin.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.sunw.self.admin.common.login.domain.LoginVO;

public class AdminInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		LoginVO loginInfo = (LoginVO)session.getAttribute("loginInfo");
		
		String userId = "userId";
		
		if(loginInfo == null || !loginInfo.getUserId().equals(userId)) {
			
			 response.sendRedirect("/common/login/login");
			 
			 return false;
			
		}
		return true;
	}

}
