package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        // db당 단 1개만 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        // 요청이 올때마다 계속 생성하는 거 close 필수
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();


        // *** JPA의 모든 데이터 변경은 트랜잭션 안에서 실행해야 함.

        try {

            /*
             ** insert **
            Member member = new Member();
            member.setId(1L);
            member.setName("test");

            em.persist(member);
            */

            /*
             ** read **
            Member findMember = em.find(Member.class, 1L);
            System.out.println(findMember.getId());
            System.out.println(findMember.getName());
            */

            /*
             ** Delete **
            Member findMember = em.find(Member.class, 1L);
            em.remove(findMember);
            */

            /*
             ** Update **
            Member findMember = em.find(Member.class, 1L);
            findMember.setName("hello");
            */

            /*
             ** JPQL example **
            List<Member> resultList = em.createQuery("select m from Member as m", Member.class)
                    .getResultList();

            for (Member member : resultList) {
                System.out.println("member.name = " + member.getName());
            }
            */

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        emf.close();
    }
}
