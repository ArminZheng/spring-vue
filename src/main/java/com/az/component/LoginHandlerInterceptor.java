package com.az.component;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登陆检查
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

    // 在目标方法执行之前
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {

        Object loginUser = request.getSession().getAttribute("loginUser");
        if (loginUser == null) {
            // 未登录，返回登陆界面
            request.setAttribute("msg", "没有权限，请先登陆");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            // 已登陆，放行请求
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler,
                                Exception ex) throws Exception {

    }

}
