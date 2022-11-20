package com.exalt.learning.sampleme.services;

import com.exalt.learning.sampleme.entities.BucketEntity;
import com.exalt.learning.sampleme.repositories.AerospikeBucketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BucketService implements IBucketService {
    @Autowired
    private AerospikeBucketRepository bucketRepository;

    @Override
    public boolean createBucket(BucketEntity bucket){
        bucketRepository.save(bucket);
        return true;
    }

    @Override
    public BucketEntity readBucketById(int id) {
        BucketEntity obj = bucketRepository.findById(id).get();
        return obj;
    }

    @Override
    public List<BucketEntity> readAllBuckets(){
        List<BucketEntity> list = new ArrayList<>();
        bucketRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public void updateBucket(BucketEntity bucket) {
        bucketRepository.save(bucket);
    }

    @Override
    public void deleteBucket(BucketEntity bucket) {
        bucketRepository.delete(bucket);
    }
}
