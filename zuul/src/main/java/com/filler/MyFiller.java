package com.filler;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: Li.Yang
 * Date: 2020/7/2
 * Time: 9:54
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Component
public class MyFiller extends ZuulFilter {

    /**
     * 过滤器类型选择：
     * pre 为路由前
     * route 为路由过程中
     * post 为路由过程后
     * error 为出现错误的时候
     * 同时也支持static ，返回静态的响应，详情见StaticResponseFilter的实现
     * 以上类型在会创建或添加或运行在FilterProcessor.runFilters(type)
     */
    @Override
    public String filterType() {
        return "pre"; //ZuulFilter源码中注释"pre"为在路由前过滤
    }

    /**
     * 用来过滤器排序执行的
     * @return 排序的序号
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否通过这个过滤器，默认为true，改成false则不启用
     */
    @Override
    public boolean shouldFilter() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        System.out.println("url==="+request.getRequestURI());
        return true;
    }

    /**
     *  run：过滤器的具体逻辑。默认是放行的
     *  通过ctx.setSendZuulResponse(false)令zuul过滤该请求，不对其进行路由，
     *  然后通过ctx.setResponseStatusCode(401)设置了其返回的错误码，
     *  也可以进一步优化比如，通过ctx.setResponseBody(body)对返回body内容进行编辑等。
     */
    @Override
    public Object run() throws ZuulException {
       /* RequestContext ctx = RequestContext.getCurrentContext();
        ctx.setSendZuulResponse(false);
        ctx.setResponseStatusCode(403);*/
        return null;
    }
}
