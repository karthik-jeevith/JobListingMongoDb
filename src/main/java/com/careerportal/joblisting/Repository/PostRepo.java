package com.careerportal.joblisting.Repository;

import com.careerportal.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends MongoRepository<Post,String> {

}
