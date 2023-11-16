package at.fhtw.swen3.paperless.services;

import at.fhtw.swen3.paperless.models.entity.DocumentEntity;
import at.fhtw.swen3.paperless.repositories.DocumentRepository;
import at.fhtw.swen3.paperless.services.dto.PostDocumentRequestDto;
import at.fhtw.swen3.paperless.services.mapper.PostDocumentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService{

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public DocumentEntity saveDocument(PostDocumentRequestDto postDocumentRequestDto) {
        var result = PostDocumentMapper.INSTANCE.dtoToEntity(postDocumentRequestDto);
        documentRepository.save(result);
        return result;
    }

    @Override
    public List<DocumentEntity> getDocuments() {
        return null;
    }

    @Override
    public DocumentEntity updateDocument(DocumentEntity documentEntity) {
        return null;
    }

    @Override
    public void deleteDocumentById(Integer id) {

    }
}
