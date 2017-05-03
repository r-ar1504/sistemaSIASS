package com.sistemaSIASS.config;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.hsqldb.util.DatabaseManagerSwing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@ComponentScan("com.sistemaSIASS.config")
public class RootApplicationContextConfig {

	
    @Bean
    public DataSource dataSource() {
    	
       EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
       EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL).addScript("db/sql/createSIASS.sql").build();
      
       return db;
    }
    
    @Bean
    public NamedParameterJdbcTemplate getJdbcTemplate() {
       
    	return new NamedParameterJdbcTemplate(dataSource());
    }
    
    @PostConstruct
    public void startDBManager() {

    	//hsqldb
    	DatabaseManagerSwing.main(new String[] { "--url", "jdbc:hsqldb:mem:testdb", "--user", "sa", "--password", "" });

    	//derby
    	//DatabaseManagerSwing.main(new String[] { "--url", "jdbc:derby:memory:testdb", "--user", "", "--password", "" });

    	//h2
    	//DatabaseManagerSwing.main(new String[] { "--url", "jdbc:h2:mem:testdb", "--user", "sa", "--password", "" });

    }
 
}
