package com.example.jobDetails.controller;

import com.example.jobDetails.entity.JobListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.jobDetails.service.JobService;

import java.util.List;

@RestController
@RequestMapping("/diyo")
public class JobController {
    @Autowired
    JobService jobService;

    //READ ALL
    @GetMapping("/getAll")
    public List<JobListing> getAllJobs(){
        return jobService.getAllJobs();
    }

    //READ ONE BY ID
    @GetMapping("/getOneById/{jobId}")
    public JobListing getJobById(@PathVariable Long jobId){
        return jobService.getJobById(jobId);
    }

    //SAVE ONE
    @PostMapping("/saveOne")
    public String saveOneByJob(@RequestBody JobListing oneJob){
        return jobService.saveOneJob(oneJob);
    }

    //SAVE ALL
    @PostMapping("/saveAll")
    public String saveAll(@RequestBody List<JobListing> allJobs){
        return jobService.saveAllJob(allJobs);
    }

    //UPDATE ONE

    @PostMapping("/updateOneById/{jobId}")
    public String updateOneById(@PathVariable Long jobId, @RequestBody JobListing jobListing){
        return jobService.updateJobById(jobId, jobListing);
    }

    //DELETE ONE
    @DeleteMapping("/deleteOneById/{jobId}")
    public String deleteOneById(@PathVariable Long jobId){
        return jobService.deleteById(jobId);
    }

    //DELETE ALL
    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        return jobService.deleteAll();
    }
}
