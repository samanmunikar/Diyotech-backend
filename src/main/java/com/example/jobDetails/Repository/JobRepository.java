package com.example.jobDetails.Repository;

import com.example.jobDetails.entity.JobListing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobListing, Long> {


}
