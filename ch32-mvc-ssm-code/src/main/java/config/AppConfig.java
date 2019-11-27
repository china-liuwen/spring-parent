package config;

import com.alibaba.druid.pool.DruidDataSource;
import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration  //配置类
@ComponentScan({"com.service"}) //组件扫描
@MapperScan("com.dao")  //映射扫描
@PropertySource("classpath:db.properties")  //扫描外部文件
@EnableTransactionManagement    //开启事务管理

public class AppConfig {

    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.url}")
    private String url;
    @Value("{$jdbc.password}")
    private String password;


    /**
     * 连接数据库
     * @return
     */
    @Bean
    public DataSource dateSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setUrl(url);
        return druidDataSource;
    }

    /**
     * 会话工厂
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dateSource());
        factoryBean.setPlugins(pageInterceptor());

        PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resourcePatternResolver.getResources("classpath:mappers/**/*.xml");

        factoryBean.setConfiguration(getConfiguration());
        return factoryBean.getObject();
    }

    /**
     * 配置 标准输出，下划线
     * @return
     */
    private org.apache.ibatis.session.Configuration getConfiguration(){
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setLogImpl(StdOutImpl.class);
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }


    /**
     * 分页拦截器
     * @return
     */
    private PageInterceptor pageInterceptor(){
        PageInterceptor pageInterceptor = new PageInterceptor();

        //属性
        Properties properties = new Properties();
        properties.put("supportMethodArguments","true");
        properties.put("reasonable","true");

        pageInterceptor.setProperties(properties);

        return pageInterceptor;
    }

    /**
     * 事务管理
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dateSource());
        return transactionManager;
    }
}





























































