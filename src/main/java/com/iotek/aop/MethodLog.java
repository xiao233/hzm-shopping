/**
 * Copyright (C), 2015-2017
 * FileName: MethodLog
 * Author:   dell
 * Date:     2017/12/22 15:48
 * Description:
 */
package com.iotek.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dell on 2017/12/22.
 */
@Aspect
@Component
public class  MethodLog {
    @Around("execution(* com.iotek.service.imp.*.*(..))")
    public Object showServiceMethodLog(ProceedingJoinPoint point){

        File file = new File("program_log");
        //没有此文件夹则创建程序日志文件夹
        file.mkdir();
        //在程序日志文件夹下创建日志文件
        String fileName =file.getAbsolutePath()+"/"+new SimpleDateFormat("yyyyMMdd_hh").format(new Date())+".log";
        file = new File(fileName);
        boolean flag = false;
        Object obj = null;

        try {
            //若文件不存在则创建文件
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //执行通知的方法
            obj = point.proceed();

            //执行成功为true
            flag = true;
        } catch (Throwable throwable) {
            //执行失败
            obj =throwable.getMessage();

        }
        try {
            //将日志信息保存到日志文件
            logWriteFile(file,point,obj,flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回执行成功的结果
        return flag==true?obj:null;
    }
    private void logWriteFile(File file,ProceedingJoinPoint point,Object obj,Boolean flag) throws IOException {
        //创建字符输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file,true))
        );
        String out ="\n\n-----------------------------------------------------"
                +"-----------------------------------------------------";
        writeLine(bw,out);
        //方法执行时间
         out="时间: "+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        writeLine(bw,out);
        //方法签名
        out = "方法: "+point.getSignature().toString();
        writeLine(bw,out);
        //执行结果
        if(flag){
            out = "结果: 方法正确执行";
        }else {
            out = "结果: 方法执行错误";
        }
        writeLine(bw,out);
        //方法执行结果显示
        out = "显示: "+obj;
        writeLine(bw,out);
        bw.flush();
        bw.close();
    }
    private void writeLine(BufferedWriter bw ,String line) throws IOException {
        bw.write(line);
        bw.newLine();
    }
}
