package nlpcn.commons.projects;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class GetParams extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("GET " + req.getRequestURL() + " "
                + req.getQueryString());

        /*参数列表*/
        Map<String, String[]> params = req.getParameterMap();

        /*参数列表string化*/
        String queryString = "";
        for (String key : params.keySet()) {
            String[] values = params.get(key);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                queryString += key + "=" + value + "&";
            }
        }
        // 去掉最后一个&
        queryString = queryString.substring(0, queryString.length() - 1);
        writer.println("GET " + req.getRequestURL() + " " + queryString);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        Map<String, String[]> params = req.getParameterMap();
        String queryString = "";
        for (String key : params.keySet()) {
            String[] values = params.get(key);
            for (int i = 0; i < values.length; i++) {
                String value = values[i];
                queryString += key + "=" + value + "&";
            }
        }
        // 去掉最后一个&
        queryString = queryString.substring(0, queryString.length() - 1);
        writer.println("POST " + req.getRequestURL() + " " + queryString);
    }
}
