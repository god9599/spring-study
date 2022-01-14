package hellojpa.mappingAdvanced;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass // 속성만 상속하려 할 떄
public abstract class BaseEntity {
    private String createdBy;
    private LocalDateTime createdDate;
    private String lastModifiedBy;
    private LocalDateTime lastModifiedDate;
}
