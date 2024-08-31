package com.pratham.spring_boot_rest.repo;

import com.pratham.spring_boot_rest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public  interface JobRepo extends JpaRepository<JobPost,Integer> {
}


// ArrayList to store JobPost objects
//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2, Arrays.asList("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//        new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
//        new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4, Arrays.asList("Python", "Machine Learning", "Data Analysis")),
//        new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5, Arrays.asList("Networking", "Cisco", "Routing", "Switching")),
//        new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3, Arrays.asList("iOS Development", "Android Development", "Mobile App"))
//));
//
//// Method to return all JobPosts
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//// Method to save a job post object into ArrayList
//public void addJob(JobPost job) {
//    jobs.add(job);
//}
//
//public JobPost getJob(int postId) {
//
//    for(JobPost job:jobs){
//        if(job.getPostId() == postId)
//            return job;
//    }
//
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for(JobPost jobPost1:jobs){
//        if(jobPost1.getPostId() == jobPost.getPostId()){
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost:jobs){
//        if(jobPost.getPostId() == postId){
//            jobs.remove(jobPost);
//        }
//    }
//}
