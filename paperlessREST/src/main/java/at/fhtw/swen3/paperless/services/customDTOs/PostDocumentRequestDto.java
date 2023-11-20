package at.fhtw.swen3.paperless.services.customDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDocumentRequestDto {
    private String title;
    private OffsetDateTime offsetDateTime;
    private Integer documentType;
    private List<Integer> tags;
    private Integer correspondent;
    private String documentContentBase64;
    // TODO implement mapping and parsing
    // private List<MultipartFile> document;
}