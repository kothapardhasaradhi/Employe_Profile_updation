package com.topgear.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class PersistenceJPAConfig {
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emFactoryBean = new LocalContainerEntityManagerFactoryBean();
		emFactoryBean.setDataSource(dataSource()); 
		emFactoryBean.setPackagesToScan(new String[] {"com.topgear.modal"});
		
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		
		emFactoryBean.setJpaVendorAdapter(vendorAdapter);
		emFactoryBean.setJpaProperties(additionalProperties());
		return emFactoryBean;
		
	}
	private Properties additionalProperties() {
		Properties properties = new Properties();
	    properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	    properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	    return properties;
	}
	@Bean
	private DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@D-113091011.wipro.com:1521:EMPPROFILEMANGEMENT");
		dataSource.setUsername("PARDHA");
		dataSource.setPassword("tiger");
		return dataSource;
	}
}
