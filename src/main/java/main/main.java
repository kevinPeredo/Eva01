package main;

import javax.persistence.EntityManager;

import db.Conn;

public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		
		
		
		
		
		
		em.getTransaction().begin();
		em.persist(cuenta2);
		em.persist(cuenta3);
		em.getTransaction().commit();
		System.out.println("Todo bien!!");
	}
}
