package com.example.githubapiconsumer.controller;

import com.example.githubapiconsumer.model.GitHubRepository;


public class GitHubRepositoryController {

    public void printRepositoryDetails(GitHubRepository repository) {
        System.out.println("Repository Details:");
        System.out.println("Name: " + repository.getName());
        System.out.println("URL: " + repository.getUrl());
        System.out.println("Description: " + repository.getDescription());
        System.out.println("Is Fork: " + repository.isFork());
        System.out.println("Branch Details:");
        for (GitHubRepository.BranchInfo branch : repository.getBranches()) {
            System.out.println("Name: " + branch.getName());
            System.out.println("URL: " + branch.getUrl());
            System.out.println("Commit SHA: " + branch.getCommitSha());
            System.out.println();
        }
    }
}
