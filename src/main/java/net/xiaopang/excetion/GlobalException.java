package net.xiaopang.excetion;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 全局异常
 * @author: Mr.songbeichang
 * @create: 2020-04-12 21:57
 **/
public class GlobalException implements HandlerExceptionResolver {
    private static Logger logger = Logger.getLogger(GlobalException.class);
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //打印日志  特定异常
        //发送邮件  短信  调用第三方接口
        logger.error("发生了异常，"+ex.getMessage());
        if(ex instanceof IndexOutOfBoundsException){
            logger.error("发生了异常，"+ex.getMessage());
        }else if (ex instanceof ArithmeticException){
            logger.error("发生了异常，"+ex.getMessage()+"\\n\\t路径"+ex.getStackTrace());
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg","发生；了异常"+ex.getMessage());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}


