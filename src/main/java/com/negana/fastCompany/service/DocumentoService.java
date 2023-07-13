package com.negana.fastCompany.service;

import com.negana.fastCompany.model.Documento;
import com.negana.fastCompany.repository.DocumentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentoService {
    private final DocumentoRepository documentoRepository;

    public DocumentoService(DocumentoRepository documentoRepository) {
        this.documentoRepository = documentoRepository;
    }

    public void save (Documento documento) {
        documentoRepository.save(documento);
    }

    public List<Documento> findAll(){
        return documentoRepository.findAll();
    }

    public Optional<Documento> findById(String Id){
        return documentoRepository.findById(Id);
    }

    public void deleteById(String Id){
        documentoRepository.deleteById(Id);
    }

}
