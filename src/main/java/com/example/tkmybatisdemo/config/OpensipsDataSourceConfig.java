package com.example.tkmybatisdemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

/**
 * @author zhahuilin
 */
@Configuration
@MapperScan(basePackages = {"com.example.tkmybatisdemo.mapper.opensips"}, sqlSessionTemplateRef = "opensipsSqlSessionTemplate")
public class OpensipsDataSourceConfig {

    @Bean(name = "opensipsDataSource")
    @ConfigurationProperties(prefix = "opensips")
    public DataSource opensipsDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "voipplatSqlSessionFactory")
    public SqlSessionFactory opensipsSqlSessionFactory(@Qualifier("opensipsDataSource") DataSource dataSource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "opensipsTransactionManager")
    public DataSourceTransactionManager opensipsTransactionManager(@Qualifier("opensipsDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "opensipsSqlSessionTemplate")
    public SqlSessionTemplate opensipsSqlSessionTemplate(
            @Qualifier("voipplatSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}