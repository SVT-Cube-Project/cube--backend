package com.svt.cube.repository;

import com.svt.cube.entity.Tag;
import com.svt.cube.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {
    Topic getById(Integer id);

    List<Topic> findAllByTagsIn(Set<Tag> tags);
}
