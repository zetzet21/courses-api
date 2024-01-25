package zetzet.exam26.coursesapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Setter
@Getter
@Entity
@Table(name = "files")
public class FileEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", type = org.hibernate.id.uuid.UuidGenerator.class)
    private String id;

    private String name;

    private String contentType;

    private Long size;

    @Lob
    private byte[] data;
}
