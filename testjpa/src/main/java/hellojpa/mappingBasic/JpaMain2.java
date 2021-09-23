package hellojpa.mappingBasic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain2 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Team team = new Team();
            team.setName("test");

            em.persist(team);

            Member member = new Member();
            member.setUsername("testName");
            member.setTeam(team);

            em.persist(member);
            em.flush();
            em.clear();

            // 조회
            Member findMember = em.find(Member.class, member.getId());

            Team findMemberTeam = findMember.getTeam();
            System.out.println("findMemberTeam : " + findMemberTeam.getName());

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }
}
