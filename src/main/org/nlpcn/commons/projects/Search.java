package nlpcn.commons.projects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Search extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/heml;charset=UTF-8");
        String wd = req.getParameter("wd").trim();
        wd = new String(wd.getBytes(),"utf-8");
    }

}
