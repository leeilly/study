package jpabook.start;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;

@Controller
public class JpaMain {
	
	public static void main(String[] args){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		try{
			tx.begin();
			//TODO
			logic(em);
			tx.commit();
			
		}catch(Exception e){
			tx.rollback();
		}finally{
			em.close();
		}
	}
	
	private static void logic(EntityManager em){
		//TODO
		String id = "id1";
		Member member = new Member();
		member.setId(id);
		member.setUsername("kj");
		member.setAge(30);
		
		em.persist(member);
		
		member.setAge(31);
		
		Member findMember = em.find(Member.class, id);
		System.out.println("findMember= " + findMember.toString());
		
		List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList(); //JPQL
		System.out.println("members.size()= " + members.size() );
		
		em.remove(member);
	}
	
}
