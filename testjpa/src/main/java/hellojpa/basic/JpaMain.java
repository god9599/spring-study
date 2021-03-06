package hellojpa.basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

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

             --- 비영속 상태 : 단지 객체를 생성했을 뿐 JPA와 아무런 상관도 없음 ---
            Member member = new Member();
            member.setId(1L);
            member.setName("test");

            --- 영속 상태 : Entity Manager안에 영속성 컨텍스트를 통해 영속성이 관리됨, 이 때 db에 저장되는 것이 아님 ---

            --- 트랜잭션을 지원하는 쓰기 지연 : 영속성 컨텍스트 안에 쓰기 지연 SQL 저장소가 있다. persist를 하면 1차 캐시에 member 객체가 들어가고 그에 해당하는 insert sql이 저장소에 저장된다.
            em.persist(member);

            --- member 엔티티를 영속성 컨텍스트에서 분리, 준영속 상태 ---
            em.detach(member);

            --- commit한 시점에서 영속성 컨텍스트에 있는 것이 쿼리로 날라가게 되는 것임 ---
            --- 쓰기 지연 SQL 저장소에 있던 SQL들이 이 때 날라감 ---
            transaction.commit();
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
             JPQL 쿼리 실행 시에 플러쉬 자동으로 호출됨
            List<Member> resultList = em.createQuery("select m from Member as m", Member.class)
                    .getResultList();

            for (Member member : resultList) {
                System.out.println("member.name = " + member.getName());
            }
            */

            /*
              ** Flush example **
            Member member1 = new Member(150L, "test");
            Member member2 = new Member(200L, "test2");

            em.persist(member1);
            em.persist(member2);

            // 플러쉬 강제 호출 - commit 전에 쓰기 지연 SQL 저장소에 있던 SQL들이 디비로 날라감
            em.flush();

            System.out.println("============================");
            */

            Member member = em.find(Member.class, 150L); // 영속 상태
            member.setName("aaaa");

            em.detach(member); // 특정 엔티티만 준영속 상태로 전환
            em.clear(); // 영속성 컨텍스트를 다 비워버림
            em.close(); // 영속성 컨텍스트 종료

           Member member2 = em.find(Member.class, 150L); // 영속성 컨텍스트(1차 캐시)를 다 비워버렸기 때문에 select 쿼리가 두 번 실행됨, 다시 영속 상태로 됨




           // 커밋 시에 플러쉬가 자동으로 호출됨 - 플러쉬는 영속성 컨텍스트를 비우지 않는다. 단지, 영속성 컨텍스트의 변경 내용을 데이터베이스의 동기화할 뿐
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
