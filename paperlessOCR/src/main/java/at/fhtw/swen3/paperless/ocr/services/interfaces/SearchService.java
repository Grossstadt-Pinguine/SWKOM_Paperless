package at.fhtw.swen3.paperless.ocr.services.interfaces;

import at.fhtw.swen3.paperless.ocr.entities.DocumentEntity;

import java.io.IOException;

public interface SearchService {

    Result indexDocument(DocumentEntity document) throws IOException;

    public Optional<DocumentEntity> getDocumentById(Integer id);

    public List<DocumentEntity> search(String searchString);
}
