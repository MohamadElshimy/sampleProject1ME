package com.exalt.learning.sampleme.repositories;

import com.exalt.learning.sampleme.entities.BucketEntity;
import org.springframework.data.aerospike.repository.AerospikeRepository;

public interface AerospikeBucketRepository extends AerospikeRepository<BucketEntity, Integer>  {
}
