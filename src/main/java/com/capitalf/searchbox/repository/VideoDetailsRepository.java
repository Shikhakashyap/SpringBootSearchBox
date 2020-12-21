package com.capitalf.searchbox.repository;

import org.springframework.stereotype.Repository;

import com.capitalf.searchbox.model.videoDetails;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VideoDetailsRepository extends JpaRepository<videoDetails, Long> {
	

}
