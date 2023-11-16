package at.fhtw.swen3.paperless.services;

import at.fhtw.swen3.paperless.models.entity.DocumentEntity;
import at.fhtw.swen3.paperless.services.dto.PostDocumentRequestDto;

import java.util.List;

public interface DocumentService {
    public DocumentEntity saveDocument(PostDocumentRequestDto postDocumentRequestDto);

    public List<DocumentEntity> getDocuments();

    public DocumentEntity updateDocument(DocumentEntity documentEntity);

    public void deleteDocumentById(Integer id);
}
