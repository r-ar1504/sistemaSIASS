//package com.sistemaSIASS.domain;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//import org.springframework.stereotype.Repository;
//
//
//@Repository
//@Transactional
//public class AlumnoDAO {
//
//	   //Private fields
//	  
//	   //An EntityManager will be automatically injected from entityManagerFactory
//	   //setup on DatabaseConfig class.
//	  @PersistenceContext
//	  private EntityManager entityManager;
//	  
//	  
//
//	  /**
//	   * Save the alumno in the database.
//	   */
//	  public void create(Alumno alumno) {
//	    entityManager.persist(alumno);
//	    return;
//	  }
//	  
//	  /**
//	   * Delete the alumno from the database.
//	   */
//	  public void delete(Alumno alumno) {
//	    if (entityManager.contains(alumno))
//	      entityManager.remove(alumno);
//	    else
//	      entityManager.remove(entityManager.merge(alumno));
//	    return;
//	  }
//	  
//	  /**
//	   * Return all the alumnos stored in the database.
//	   */
//	  @SuppressWarnings("unchecked")
//	  public List getAll() {
//	    return entityManager.createQuery("from Alumno").getResultList();
//	  }
//	  
//
//
//	  /**
//	   * Update the passed alumno in the database.
//	   */
//	  public void update(Alumno alumno) {
//	    entityManager.merge(alumno);
//	    return;
//	  }
//
//}
