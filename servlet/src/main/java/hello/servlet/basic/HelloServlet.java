package hello.servlet.basic;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// HTTP 요청

/**
 *
 * HttpServletRequest 역할
 * HTTP 요청 메시지를 편리하게 사용할 수 있도록
 * 대신 메시지를 파싱하고 HttpServletRequest 객체에 담아서 제공
 *
 * 	START LINE
 * 		HTTP 메소드, URL, 쿼리 스트링, 스키마, 프ㅗ토콜
 * 	헤더
 * 		헤더 조회
 * 	바디
 * 		form 파라미터 형식 조회, message body 데이터 직접조회
 *
 * 	임시 저장소 기능 (저장, 조회)
 *
 * 	세션 관리 기능
 *
 * 	서블릿은 HTTP 요청 메시지, HTTP 응답 메시지를 편리하게 사용하도록 도와주는 객체
 **/

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("req = " + req);
        System.out.println("resp = " + resp);

        String message = req.getParameter("message");
        System.out.println("message = " + message);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("Hello World" + message);
    }
}
