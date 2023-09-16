package com.anilmacherla.socialmedia.persistence;

import com.anilmacherla.socialmedia.domain.ProfileNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepositroy extends Neo4jRepository<ProfileNode,Long> {
}
