package hellojpa.mapping;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "name", columnNames = {"name"}),
        @UniqueConstraint(name = "age", columnNames = {"age"})})
/*
* 미리 50개의 id 값을 불러오고 메모리에서 사용 50번까지 쓰면 미리 +50개씩 생성
* allocationSize를 설정하지 않으면 계속해서 네트워크(데이터베이스에 다음 id값 내놓으라고 요청하기 때문)를 타야하므로 성능 최적화에 사용된다.
* SEQUENCE 전략은 영속성 commit시에 SQL이 날라감
* */
@SequenceGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        sequenceName = "MEMBER_SEQ",
        initialValue = 1,
        allocationSize = 50
)
public class Member {
    @Id // Id를 직접 할당해야 함
    /*
     * IDENTITY 전략에서는 persist하는 시점에서 바로 SQL이 DB로 날라간다.
     * WHY? AUTO_INCREMENT는 데이터베이스에 insert SQL을 실행한 이후에 ID값을 알 수 있다. 그러면 영속성 컨텍스트에서 관리를 커밋하기 전까지 할 수가 없음
     * THEN. 모아서 SQL을 날리는 행위는 할 수 없음.
     *
     @GeneratedValue(strategy = GenerationType.IDENTITY) // 디비에 Id 생성 위임
     * */
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
    private Long id;

    @Column(name = "name")
    private String username; // 객체는 username, 컬럼은 name

    @Column()
    private Integer age;

    @Enumerated(EnumType.STRING) // enum 매핑, ORDINAL 타입으로 안쓰는 걸로. 순서에 의한 문제가 생김
    private RoleType roleType;

    @Column()
    private LocalDate createDate;

    @Column()
    private LocalDateTime lasteModifiedDateTime;

    @Lob // 큰 컨텐츠 넣을때 , 문자면 CLOB, 나머지는 BLOB 매핑
    private String description;

    @Transient // db와 상관없이 쓰고 싶을 때. 컬럼 자동 생성 안해주고 싶을 때(메모리에서만 사용)
    private int temp;
}
