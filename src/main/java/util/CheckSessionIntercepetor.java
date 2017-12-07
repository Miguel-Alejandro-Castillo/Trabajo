package util;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Alejandro on 6/12/2017.
 */
public class CheckSessionIntercepetor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        HttpSession session=request.getSession(false);
        if (session != null && session.getAttribute("Id") != null) {
            return true;
        }else{
            response.sendRedirect("login");
            return false;
        }

    }

}
