package hellojpa.mappingAdvanced;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // ITEM 테이블 만들어지지 않음 - 비추천
@DiscriminatorColumn
public abstract class Item extends BaseEntity{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int price;
}
