package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPU");
EntityManager em = emf.createEntityManager();


Book b1=new Book("Popular", "Willian", 50000);
Book b2=new Book("TopTen", "Jons", 60000);
Book b3=new Book("SelfStudy", "Harry", 10000);


em.getTransaction().begin();
em.persist(b1);
em.persist(b2);
em.persist(b3);
em.getTransaction().commit();
em.createQuery("select b from Book b where b.name like 'W' ",Book.class)
.getResultList()
.forEach(System.out::println);

em.close();
emf.close();
util.JPAUtil.checkData("select * from Book");
	}

}
