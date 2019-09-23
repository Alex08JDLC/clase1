package config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class conexion {
    
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource data = new DriverManagerDataSource();
        data.setDriverClassName("com.mysql.jdbc.Driver");
        data.setUrl("jdbc:mysql://localhost:3306/registro");
        data.setUsername("root");
        data.setPassword("12345678");
        return data;                
    }
    
}
