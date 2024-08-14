package com.example.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entities.Segment;
import com.example.repository.SegmentRepository;

import java.util.List;

@Service
public class SegmentServiceImpl implements SegmentService {
    

    @Autowired
    SegmentRepository segmentRepository;
    
    @Override
    public List<Segment> getAllSegments() {
        return segmentRepository.findAll();
    }

    /*
    //@Override
    public Segment getSegmentById(int id) {
      return segmentRepository.findById(id).orElse(null);
    }
    */

	
}
