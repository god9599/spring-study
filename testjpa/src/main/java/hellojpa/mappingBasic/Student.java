package hellojpa.mappingBasic;

import javax.persistence.*;

@Entity
public class Student {
    @Id @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "LOCKER_ID")
    private Locker locker;

    @Column
    private String username;
}
