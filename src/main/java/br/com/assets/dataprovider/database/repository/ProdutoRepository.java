package br.com.assets.dataprovider.database.repository;

import br.com.assets.dataprovider.database.entity.ProdutoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProdutoRepository extends MongoRepository<ProdutoEntity, String> {

}
