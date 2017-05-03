//package com.sistemaSIASS.domain.repository.impl;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;
//
//import com.sistemaSIASS.domain.Alumno;
//import com.sistemaSIASS.domain.repository.AlumnoRepository;
//
//
//
//@Service
//public class InMemoryAlumnoRepository implements AlumnoRepository{
//       
//	@Autowired
//       private NamedParameterJdbcTemplate jdbcTemplate;
//       
//       @Override
//       public List<Alumno> getAllAlumnos() {
//    	   
//          Map<String, Object> params = new HashMap<String, Object>();
//            List<Alumno> result = jdbcTemplate.query("SELECT * FROM alumno", params, new AlumnoMapper());
//            return result;
//       }
//       
//     private static final class AlumnoMapper implements RowMapper<Alumno> {
//       
//    	 	public Alumno mapRow(ResultSet rs, int rowNum) throws SQLException {
//       
//		    	Alumno alumno = new Alumno();
//		    	
//		    	alumno.setMatricula(rs.getString("MATRICULA"));
//		    	alumno.setApellido1(rs.getString("NOMBRE"));
//		    	alumno.setApellido2(rs.getString("APELLIDO"));
//		        
//		        return alumno;
//		    }
//     }
//}
//
//
