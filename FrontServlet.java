import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FrontServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getPathInfo(); // ex: /home
        if (path == null || path.equals("/")) {
            path = "/index";
        }

        String view = "/WEB-INF/views" + path + ".jsp"; // ex: /WEB-INF/views/home.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request, response);
    }
}