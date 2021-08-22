package net.inetsolv.moc1;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
	@Autowired
private DataSource datasource;
	public static void main( String[] args )
    {
    	
    	SpringApplication.run(App.class, args);
    
    }
	
	@PostConstruct
	public void init() {
		System.out.println(datasource);
	}
}
