package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // servlet = controller, view = jsp
        // 컨트롤러에서 뷰로 넘겨줘야함
        String viewPath = "/WEB-INF/views/new-form.jsp";
        // 이게 넘어갈 때 필요함
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        // forword를 실행해야 뷰로 넘어감
        dispatcher.forward(request, response);
    }
}
