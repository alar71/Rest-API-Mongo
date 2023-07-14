package com.negana.fastCompany.controller;

import com.negana.fastCompany.model.Documento;
import com.negana.fastCompany.service.DocumentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class DocumentoController {

    private final DocumentoService documentoService;

    public DocumentoController(DocumentoService documentoService) {
        this.documentoService = documentoService;
    }

    @PostMapping("/documentos")
    public void save(@RequestBody Documento documento){

        documentoService.save(documento);

    }
    @GetMapping("/documentos")
    public List<Documento> findAll(){

        return documentoService.findAll();
    }
    @GetMapping("/documento/{Id}")
    public Optional<Documento> findById(@PathVariable String Id){

        //return documentoService.findById(Id).get();
        return documentoService.findById(Id);
    }
    @DeleteMapping("/documento/{Id}")
    public void deleteById(@PathVariable String Id){
        documentoService.deleteById(Id);
    }

    @PutMapping("/personas")
    public void update(@RequestBody Documento documento){
        documentoService.save(documento);
    }
}
