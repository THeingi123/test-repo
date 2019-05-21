package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPU");
EntityManager em = emf.createEntityManager();

Employee e1=new Employee("Thaw Thaw",12,"HT",234444);
Employee e2=new Employee("Maw Maw",23,"HH",250000);
Employee e3=new Employee("Hla Hla",34,"HR",500000);
em.getTransaction().begin();
em.persist(e1);
em.persist(e2);
em.persist(e3);

em.getTransaction().commit();

em.close();
emf.close();

util.JPAUtil.checkData("select * from employee");
	}

}
