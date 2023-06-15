package controller;

import entity.JobListing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.JobService;

import java.util.List;

@RestController
@RequestMapping("/diyotech/jobs/")
public class JobController {
    private final JobService jobService;

    @Autowired
    JobController(JobService jobService){
        this.jobService = jobService;
    }

    //READ ALL
    @GetMapping("getAll")
    public List<JobListing> getAllJobs(){
        return jobService.getAllJobs();
    }

    //READ ONE BY ID
    @GetMapping("getOne/{jobId}")
    public JobListing getJobById(@PathVariable Long jobId){
        return jobService.getJobById(jobId);
    }

    //SAVE ONE
    @PostMapping("saveOne")
    public String saveOne(@RequestBody JobListing oneJob){
        return jobService.saveOneJob(oneJob);
    }

    //SAVE ALL
    @PostMapping("saveAll")
    public String saveAll(@RequestBody List<JobListing> allJobs){
        return jobService.saveAllJob(allJobs);
    }

    //UPDATE ONE

    @PostMapping("updateOne/{jobId}")
    public String updateOne(@PathVariable Long jobId, @RequestBody JobListing jobListing){
        return jobService.updateJobById(jobId, jobListing);
    }

    //DELETE ONE
    @DeleteMapping("/deleteOne/{jobId}")
    public String deleteOne(@PathVariable Long jobId){
        return jobService.deleteById(jobId);
    }

    //DELETE ALL
    @DeleteMapping("deleteAll")
    public String deleteAll(){
        return jobService.deleteAll();
    }
}
