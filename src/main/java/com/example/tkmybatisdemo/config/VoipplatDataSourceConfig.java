package com.example.tkmybatisdemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * @author zhahuilin
 */
@Configuration
@MapperScan(basePackages = {"com.example.tkmybatisdemo.mapper.voipplatform"}, sqlSessionTemplateRef = "voipplatformSqlSessionTemplate")
public class VoipplatDataSourceConfig {

    @Bean(name = "voipplatformDataSource")
    @ConfigurationProperties(prefix = "voipplatform")
    @Primary
    public DataSource voipplatformDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "voipplatformSqlSessionFactory")
    @Primary
    public SqlSessionFactory voipplatformSqlSessionFactory(@Qualifier("voipplatformDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "voipplatformTransactionManager")
    @Primary
    public DataSourceTransactionManager voipplatformTransactionManager(@Qualifier("voipplatformDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "voipplatformSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate voipplatformSqlSessionTemplate(
            @Qualifier("voipplatformSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}