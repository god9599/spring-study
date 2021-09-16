package hellojpa.mapping;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(name = "name", columnNames = {"name"}),
        @UniqueConstraint(name = "age", columnNames = {"age"})})
public class Member {
    @Id
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
