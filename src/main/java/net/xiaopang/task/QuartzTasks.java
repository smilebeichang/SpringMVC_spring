package net.xiaopang.task;


import org.apache.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description: 定时任务
 * @author: Mr.songbeichang
 * @create: 2020-04-13 23:29
 **/

public class QuartzTasks {
    public Logger logger = Logger.getLogger(QuartzTasks.class);
    static  int i =1;
    public void task1(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        logger.info("定时任务一 张无忌第"+i+"次练功时间==========="+simpleDateFormat.format(date));
        ++i;
    }
    public void task2(){
        logger.info("定时任务二");
    }
    public void task3(){
        logger.info("定时任务三");
    }
}

