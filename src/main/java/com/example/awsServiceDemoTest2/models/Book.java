package com.example.awsServiceDemoTest2.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "books") //Sist tillagd 21/2 - från lektion 12/2
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @MongoId
    private Long id;
    private String title;
    private String author;
}