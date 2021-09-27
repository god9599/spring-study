package hellojpa.mappingBasic;

import javax.persistence.*;

@Entity
public class Locker {
    @Id @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "locker")
    private Student student;

    @Column
    private String name;
}
