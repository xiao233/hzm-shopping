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
        //û�д��ļ����򴴽�������־�ļ���
        file.mkdir();
        //�ڳ�����־�ļ����´�����־�ļ�
        String fileName =file.getAbsolutePath()+"/"+new SimpleDateFormat("yyyyMMdd_hh").format(new Date())+".log";
        file = new File(fileName);
        boolean flag = false;
        Object obj = null;

        try {
            //���ļ��������򴴽��ļ�
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            //ִ��֪ͨ�ķ���
            obj = point.proceed();

            //ִ�гɹ�Ϊtrue
            flag = true;
        } catch (Throwable throwable) {
            //ִ��ʧ��
            obj =throwable.getMessage();

        }
        try {
            //����־��Ϣ���浽��־�ļ�
            logWriteFile(file,point,obj,flag);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //����ִ�гɹ��Ľ��
        return flag==true?obj:null;
    }
    private void logWriteFile(File file,ProceedingJoinPoint point,Object obj,Boolean flag) throws IOException {
        //�����ַ��������������
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(file,true))
        );
        String out ="\n\n-----------------------------------------------------"
                +"-----------------------------------------------------";
        writeLine(bw,out);
        //����ִ��ʱ��
         out="ʱ��: "+new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        writeLine(bw,out);
        //����ǩ��
        out = "����: "+point.getSignature().toString();
        writeLine(bw,out);
        //ִ�н��
        if(flag){
            out = "���: ������ȷִ��";
        }else {
            out = "���: ����ִ�д���";
        }
        writeLine(bw,out);
        //����ִ�н����ʾ
        out = "��ʾ: "+obj;
        writeLine(bw,out);
        bw.flush();
        bw.close();
    }
    private void writeLine(BufferedWriter bw ,String line) throws IOException {
        bw.write(line);
        bw.newLine();
    }
}
