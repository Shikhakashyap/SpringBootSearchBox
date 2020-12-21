package com.capitalf.searchbox.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import javax.validation.Valid;


import com.capitalf.searchbox.model.videoDetails;
import com.capitalf.searchbox.repository.VideoDetailsRepository;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class searchboxController {
	
	@Autowired
    private VideoDetailsRepository videoDetailsRepository;
	
	@GetMapping("/videodetails")
    public List<videoDetails> getAllEmployees() {
        return videoDetailsRepository.findAll();
    }
	
	
	@PostMapping("/videoDetails")
    public videoDetails createVideoDetails(@RequestBody videoDetails videodetails) {
        return videoDetailsRepository.save(videodetails);
    }

}
