package servlet;

import domain.UserBean;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import util.MyDateConverter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Map;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        // register your own date converter
        ConvertUtils.register(new MyDateConverter(), Date.class);

        // encapsulate data into beans
        Map map = request.getParameterMap();
        UserBean userBean = new UserBean();
        try {
            BeanUtils.populate(userBean, map);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(userBean);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
