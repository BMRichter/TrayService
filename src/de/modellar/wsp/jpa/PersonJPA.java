package de.modellar.wsp.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import de.modellar.wsp.model.Person;
import de.modellar.wsp.model.SearchQuery;

public class PersonJPA {

	private static final String PERSISTENCE_UNIT_NAME = "persondb";
	private static EntityManagerFactory emFactory;
	
	public Person getPerson(SearchQuery fullname) {

		EntityManager iEntityManager = getEntityManager();
		
		Query query = iEntityManager.createQuery("SELECT e FROM Person e WHERE e.fname = :fname AND e.lname = :lname");
		query.setParameter("fname", fullname.getFname());
		query.setParameter("lname", fullname.getLname());
		
		Person iPerson = null;
		try {
			iPerson = (Person) query.getSingleResult();
		} catch(PersistenceException pe) {
			pe.printStackTrace();
			return iPerson;
		}
		
		return iPerson;

	}

	public boolean addPerson(Person person) {
		
		EntityManager iEntityManager = getEntityManager();
		
		EntityTransaction iEntityTransaction = iEntityManager.getTransaction();
		iEntityTransaction.begin();
		try {
			iEntityManager.persist(person);
			iEntityTransaction.commit();
		} catch(PersistenceException pe) {
			pe.printStackTrace();
			return false;
		} finally {
			iEntityManager.close();
		}
		
		return true;
	}
	
	private EntityManager getEntityManager() {
		emFactory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager iEntityManager = emFactory.createEntityManager();
		
		return iEntityManager;
	}
}
