package com.example.githubapiconsumer.model;

import java.util.List;

public class GitHubRepository {
    private String name;
    private String url;
    private String description;
    private boolean fork;
    private List<BranchInfo> branches;

    public GitHubRepository() {
    }

    public GitHubRepository(String name, String url, String description, boolean fork, List<BranchInfo> branches) {
        this.name = name;
        this.url = url;
        this.description = description;
        this.fork = fork;
        this.branches = branches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public List<BranchInfo> getBranches() {
        return branches;
    }

    public void setBranches(List<BranchInfo> branches) {
        this.branches = branches;
    }

    public static class BranchInfo {
        private String name;
        private String url;
        private String commitSha;

        public BranchInfo() {
        }

        public BranchInfo(String name, String url, String commitSha) {
            this.name = name;
            this.url = url;
            this.commitSha = commitSha;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCommitSha() {
            return commitSha;
        }

        public void setCommitSha(String commitSha) {
            this.commitSha = commitSha;
        }
    }
}
