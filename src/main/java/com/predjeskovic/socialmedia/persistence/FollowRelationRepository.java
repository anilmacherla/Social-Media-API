package com.anilmacherla.socialmedia.persistence;

import com.anilmacherla.socialmedia.domain.FollowRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FollowRelationRepository extends Neo4jRepository<FollowRelation, Long> {
}
