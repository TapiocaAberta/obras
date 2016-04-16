package com.sjcdigital.obras.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sjcdigital.obras.model.documents.Cidade;

public interface Cidades extends MongoRepository<Cidade, String> { }
