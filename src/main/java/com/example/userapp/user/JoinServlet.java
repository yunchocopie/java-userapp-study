package com.example.userapp.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;

//@WebServlet("/join")
public class JoinServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        // username=ssar&password=1234&email=ssar@nate.com - 이 데이터는 버퍼에 있음 (req에)


//        BufferedReader br = req.getReader();
//
//        String requestBody = "";
//
//        while (true) {
//            String line = br.readLine();
//
//            if (line == null) break;
//
//            requestBody = requestBody + line;
//        }
//
//        System.out.println(requestBody);

        // 1. 파싱
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");


        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("email : " + email);

//        BufferedReader br = req.getReader(); 버퍼에 있는 데이터를 이미 소비했기 떄문에 값이 없음
//        br.readLine();

        // 2. 유효성 검사 (1000줄 됨)
        if (username.length() < 3 || username.length() > 10) {
            //resp.setHeader("Content-Type", "text/html; charset=utf-8"); 맨 위로 올림
            resp.getWriter().println("<h1>username의 글자수가 3~10 사이여야 합니다.");
        }

        // 3. DB연결

        // 4. DAO의 insert 메서드 호출 (1을 응답 받아야 함)

        // 5. 메인 페이지 그리기 - 비효율적 (MainServlet)

        // 6. 리다이렉트
        // resp.sendRedirect("/main");
        resp.setStatus(302);
        resp.setHeader("Location", "/main");
        resp.setHeader("clock", "12pm");
    }
}
