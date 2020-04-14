package net.xiaopang.interceptor;


import net.xiaopang.controller.BaseController;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 拦截器
 * @author: Mr.songbeichang
 * @create: 2020-04-12 21:05
 **/
public class SecondInterceptor extends BaseController implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("2222222222preHandle");
        request.setAttribute("msg", "权限不够，请联系管理员");
        //request.getRequestDispatcher("/WEB-INF/jsp/error.jsp").forward(request,response);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("2222222222postHandle");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("2222222222postHandle");
    }
}



