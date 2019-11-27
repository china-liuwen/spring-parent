package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * ComponentScan类似于xml中的context:componentScan
 * 要求被管理的bean有相关的的注解
 *
 * EnableAspectJAutoProxy注解等价于xml中的aop:aspectj-Auto-Proxy
 *
 * EnableTransactionManagement注解等价于xml中tx:annotation-driven
 *
 * 只需要保证事务管理器的bean的名称为txManager和transactionManager就可以了
 */

@Configuration
@ComponentScan("com")   //扫描包
@EnableAspectJAutoProxy   //切面
@EnableTransactionManagement  //事务注解
public class AnnoSupportTxConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/demo");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root;");
        return druidDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    /**
     * 事务管理器  就像<bean id="xxx" class="xxx"
     * @return
     */
    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }
}
