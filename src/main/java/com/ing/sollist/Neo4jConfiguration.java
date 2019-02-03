package com.ing.sollist;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories("com.ing.sollist.repositories")
@EnableTransactionManagement
public class Neo4jConfiguration { }
