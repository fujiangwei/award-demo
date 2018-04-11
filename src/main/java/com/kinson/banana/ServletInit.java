package com.kinson.banana;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * descripiton:
 *
 * @author: www.iknowba.cn
 * @date: 2018/4/11
 * @time: 21:49
 * @modifier:
 * @since:
 */
public class ServletInit extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BananaApplication.class);
    }
}
