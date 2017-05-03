//
//import java.util.Properties;
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//public class PersistenceConfig {
//
//	  // Private fields
//	  
//	  @Autowired
//	  private Environment env;
//
//	  @Autowired
//	  private DataSource dataSource;
//
//	  @Autowired
//	  private LocalContainerEntityManagerFactoryBean entityManagerFactory;
//	  
//	  @Bean
//	  public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//	    LocalContainerEntityManagerFactoryBean entityManagerFactory =
//	        new LocalContainerEntityManagerFactoryBean();
//	    
//	    entityManagerFactory.setDataSource(dataSource);
//	    
//	    // Classpath scanning of @Component, @Service, etc annotated class
//	    entityManagerFactory.setPackagesToScan(env.getProperty("com.SIASS.model"));
//	    
//	    // Vendor adapter
//	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//	    entityManagerFactory.setJpaVendorAdapter(vendorAdapter);
//	    
//	    // Hibernate properties
//	    Properties additionalProperties = new Properties();
//	    additionalProperties.put(
//	        "hibernate.dialect", 
//	        env.getProperty("hibernate.dialect"));
//	    additionalProperties.put(
//	        "hibernate.show_sql", 
//	        env.getProperty("hibernate.show_sql"));
//	    additionalProperties.put(
//	        "hibernate.hbm2ddl.auto", 
//	        env.getProperty("hibernate.hbm2ddl.auto"));
//	    entityManagerFactory.setJpaProperties(additionalProperties);
//	    
//	    return entityManagerFactory;
//	  }
//
//	  
//	  @Bean
//	  public JpaTransactionManager transactionManager() {
//	    JpaTransactionManager transactionManager = 
//	        new JpaTransactionManager();
//	    transactionManager.setEntityManagerFactory(
//	        entityManagerFactory.getObject());
//	    return transactionManager;
//	  }
//	  
//	  /**
//	   * PersistenceExceptionTranslationPostProcessor is a bean post processor
//	   * which adds an advisor to any bean annotated with Repository so that any
//	   * platform-specific exceptions are caught and then rethrown as one
//	   * Spring's unchecked data access exceptions (i.e. a subclass of 
//	   * DataAccessException).
//	   */
//	  @Bean
//	  public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//	    return new PersistenceExceptionTranslationPostProcessor();
//	  }
//	  
//}
//*/