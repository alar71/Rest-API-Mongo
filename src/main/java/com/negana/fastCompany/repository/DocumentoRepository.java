package com.negana.fastCompany.repository;

import com.negana.fastCompany.model.Documento;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentoRepository extends MongoRepository<Documento, String> {
}
