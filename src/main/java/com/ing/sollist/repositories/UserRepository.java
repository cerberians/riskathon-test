package com.ing.sollist.repositories;

import com.ing.sollist.entities.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Long> {}
