package at.fhtw.swen3.paperless.models.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Length;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "document")
public class DocumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer correspondent;

    private Integer documentType;

    @NotNull(message = "Document title cannot be null")
    @NotEmpty(message = "Document title cannot be empty")
    @Size(max = 40, message = "A valid document title must contain less than 40 characters")
    private String title;

    @Column(length = 4096)
    @NotNull(message = "Document content cannot be null")
    @NotEmpty(message = "Document content cannot be empty")
    private String content;

    private String createdDate;
}
