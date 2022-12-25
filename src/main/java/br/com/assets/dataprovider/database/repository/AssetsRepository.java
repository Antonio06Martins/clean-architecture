package br.com.assets.dataprovider.database.repository;

import br.com.assets.dataprovider.database.entity.AssetsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AssetsRepository extends MongoRepository<AssetsEntity, String> {

}
