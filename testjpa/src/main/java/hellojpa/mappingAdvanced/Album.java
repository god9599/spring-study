package hellojpa.mappingAdvanced;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A") // default value is entity name
public class Album extends Item{
    private String artist;
}
