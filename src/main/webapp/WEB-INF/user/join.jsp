
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    response.setHeader("Content-Type", "text/html; charset=utf-8");

    // 1. 파싱
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    String email = request.getParameter("email");


    System.out.println("username : " + username);
    System.out.println("password : " + password);
    System.out.println("email : " + email);


    // 2. 유효성 검사 (1000줄 됨)
    if (username.length() < 3 || username.length() > 10) {
        //resp.setHeader("Content-Type", "text/html; charset=utf-8"); 맨 위로 올림
        response.getWriter().println("<h1>username의 글자수가 3~10 사이여야 합니다.");
        return;
    }

    // 3. DB연결

    // 4. DAO의 insert 메서드 호출 (1을 응답 받아야 함)

    // 5. 메인 페이지 그리기 - 비효율적 (MainServlet)

    // 6. 리다이렉트
    // resp.sendRedirect("/main");
    response.setStatus(302);
    response.setHeader("Location", "/main.do");
    response.setHeader("clock", "12pm");
%>
