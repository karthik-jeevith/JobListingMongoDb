package com.careerportal.joblisting.controller;


import com.careerportal.joblisting.Repository.PostRepo;
import com.careerportal.joblisting.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @ApiIgnore
    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts()
    {
        return repo.findAll();
    }

    //  If @RequestBody not being used, only null data will be added into DB.
    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return repo.save(post);
    }

}
