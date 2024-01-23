package me.coding.votacaobbbapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document

public class ParametroModel {

    @Id
    private String chave;
    private String valor;
    
}
