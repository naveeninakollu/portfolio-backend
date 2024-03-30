package dev.portfolio.repository;

//import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.portfolio.model.Model;

@Repository
public interface Repository1 extends MongoRepository<Model, ObjectId> {

//	public List<Model> getAll();

}
