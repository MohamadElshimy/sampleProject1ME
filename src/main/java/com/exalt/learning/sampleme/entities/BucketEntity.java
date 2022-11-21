package com.exalt.learning.sampleme.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.aerospike.mapping.Document;
import org.springframework.data.annotation.Id;

@Data
@Document(collection = "BucketME")
@AllArgsConstructor
@NoArgsConstructor
public class BucketEntity {
    @Id
    private int id;
    private String type;
    private int size;
}