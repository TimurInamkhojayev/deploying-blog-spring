package com.site.midtermproject.repo;

import com.site.midtermproject.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}
