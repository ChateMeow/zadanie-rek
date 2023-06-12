package com.example.githubapiconsumer.service;

import com.example.githubapiconsumer.model.GitHubRepository;
import com.example.githubapiconsumer.model.GitHubRepository.BranchInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GitHubApiService {
    private static final String GITHUB_API_BASE_URL = "https://api.github.com";

    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    public GitHubApiService() {
        this.httpClient = HttpClientBuilder.create().build();
        this.objectMapper = new ObjectMapper();
    }

    public GitHubRepository getRepository(String owner, String repoName) throws IOException {
        String apiUrl = GITHUB_API_BASE_URL + "/repos/" + owner + "/" + repoName;
        HttpUriRequest request = new HttpGet(apiUrl);
        HttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        String json = EntityUtils.toString(entity);

        return objectMapper.readValue(json, GitHubRepository.class);
    }

    public BranchInfo getBranch(String owner, String repoName, String branchName) throws IOException {
        String apiUrl = GITHUB_API_BASE_URL + "/repos/" + owner + "/" + repoName + "/branches/" + branchName;
        HttpUriRequest request = new HttpGet(apiUrl);
        HttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();
        String json = EntityUtils.toString(entity);

        return objectMapper.readValue(json, BranchInfo.class);
    }
}
