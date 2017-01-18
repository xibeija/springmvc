package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 教师机01 on 2017/1/18 0018 11:44.
 */
@Controller
public class Hello {

    @RequestMapping(value="/abc")
    public void abc(HttpServletResponse res) throws IOException {
        res.setCharacterEncoding("utf-8");
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        out.print("hello - spring mvc - 中华人民共和国");
        out.flush();
        out.close();
    }

    @RequestMapping("/user.action")@ResponseBody
    public String user(){
        return "用户中心";
    }
}
