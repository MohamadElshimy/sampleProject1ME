package com.exalt.learning.sampleme.services;

import com.exalt.learning.sampleme.entities.BucketEntity;

import java.util.List;

public interface IBucketService {
    boolean createBucket(BucketEntity bucket);
    List<BucketEntity> readAllBuckets();
    BucketEntity readBucketById(int id);
    void updateBucket(BucketEntity bucket);
    void deleteBucket(BucketEntity bucket);
}
