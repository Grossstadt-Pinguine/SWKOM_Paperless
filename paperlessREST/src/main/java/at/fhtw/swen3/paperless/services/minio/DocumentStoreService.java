package at.fhtw.swen3.paperless.services.minio;

import org.springframework.web.multipart.MultipartFile;

public interface DocumentStoreService {

    public void handleFileUpload(MultipartFile document);

}
