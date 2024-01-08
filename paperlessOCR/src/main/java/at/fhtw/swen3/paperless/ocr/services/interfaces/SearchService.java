package at.fhtw.swen3.paperless.ocr.services.interfaces;

import at.fhtw.swen3.paperless.ocr.entities.DocumentEntity;
import co.elastic.clients.elasticsearch._types.Result;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface SearchService {

    public Result indexDocument(DocumentEntity document) throws IOException;

    public Optional<DocumentEntity> getDocumentById(Integer id);

    public List<DocumentEntity> search(String searchString);
}