package com.zch.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by Jimmy on 2022/1/24
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.zch.mapper")
public class MybatisPlusConfig {
    @Bean
    public PaginationInterceptor paginationIntercepter(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}
