package com.wei.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.ContextLifecycleFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.web.method.support.CompositeUriComponentsContributor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@Component
public class MyZuulFilter extends ZuulFilter {

    /** pre:前;routing:路由时;post:路由后;error:错误时
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**排序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**是否需要过滤 true/false
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * @return 核心方法,假设:请求必须携带token参数
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        //禁止response后续操作
//        currentContext.setSendZuulResponse(false);
        HttpServletRequest request = currentContext.getRequest();
        String token = request.getParameter("token");
        if (token == null) {
            HttpServletResponse response = currentContext.getResponse();
            PrintWriter writer = null;
            try {
                response.setContentType("text/html; charset=UTF-8");
                writer = response.getWriter();
                writer.println("缺失Token参数!");
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                writer.close();
            }
        }
        return null;
    }
}
