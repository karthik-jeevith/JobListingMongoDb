package com.careerportal.joblisting.Repository;

import com.careerportal.joblisting.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


//while connecting mondo-db cloud use mobile hotspot and make sure IP is added in custer.
@Repository
public interface PostRepo extends MongoRepository<Post,String> {

}
