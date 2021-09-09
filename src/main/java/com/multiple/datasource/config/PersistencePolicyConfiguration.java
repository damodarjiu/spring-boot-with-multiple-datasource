package com.multiple.datasource.config;

import javax.persistence.*;
import javax.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.core.env.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.*;
import org.springframework.orm.jpa.*;
import org.springframework.orm.jpa.vendor.*;
import org.springframework.transaction.*;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.multiple.datasource.repository.policy",
    entityManagerFactoryRef = "policyEntityManager",
    transactionManagerRef = "policyTransactionManager")
public class PersistencePolicyConfiguration {

  @Autowired private Environment env;

  @Primary
  @Bean(name = "policyDataSource")
  public DataSource dataSource() {
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName(env.getProperty("spring.jdbc.driverClassName"));
    dataSource.setUrl(env.getProperty("spring.policy.datasource.url"));
    dataSource.setUsername(env.getProperty("spring.policy.datasource.username"));
    dataSource.setPassword(env.getProperty("spring.policy.datasource.password"));
    return dataSource;
  }

  @Bean(name = "policyEntityManager")
  @Primary
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(
      @Qualifier("policyDataSource") DataSource dataSource) {
    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSource);
    em.setPackagesToScan(new String[] {"com.multiple.datasource.model.policy"});

    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    em.setJpaVendorAdapter(vendorAdapter);
    HashMap<String, Object> properties = new HashMap<>();
    properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
    properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
    em.setJpaPropertyMap(properties);

    return em;
  }

  @Primary
  @Bean(name = "policyTransactionManager")
  public PlatformTransactionManager transactionManager(
      @Qualifier("policyEntityManager") EntityManagerFactory entityManagerFactory) {
    JpaTransactionManager transactionManager = new JpaTransactionManager();
    transactionManager.setEntityManagerFactory(entityManagerFactory);
    return transactionManager;
  }
}
