package com.example.awsServiceDemoTest2.repository;


import com.example.awsServiceDemoTest2.models.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<Book, String>{
}