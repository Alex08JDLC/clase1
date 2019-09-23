package controller;

import config.conexion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.servlet.ModelAndView;

public class controlador {
    conexion conn = new conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    ModelAndView mav = new ModelAndView();
    
    
}
