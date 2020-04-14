package net.xiaopang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: 拦截器控制层
 * @author: Mr.songbeichang
 * @create: 2020-04-12 21:14
 **/
@Controller
public class InterceptorController extends BaseController{
    @RequestMapping("/inter")
    protected String inter(){
        logger.info("拦截器控制层");
        //int i = 1/0;
        return "interceptor";
    }
}


