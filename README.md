GitHub API Consumer
The GitHub API Consumer is a Java application that allows users to retrieve information about GitHub repositories and their branches. It interacts with the GitHub API to fetch repository data and provides a simple command-line interface for users to interact with.

Features
List all non-fork repositories for a given GitHub user
Display repository name, owner login, branch names, and last commit SHA for each repository
Handle error scenarios gracefully, including handling non-existent users and unsupported content types
Prerequisites
Java Development Kit (JDK) 8 or laterApache Maven

Getting Started
Clone the repository:
git clone https://github.com/your-username/github-api-consumer.git

Build the project using Maven:
cd github-api-consumer
mvn clean install

Run the application:
mvn exec:java -Dexec.mainClass="com.example.githubapiconsumer.App"

Usage
Upon running the application, you will be prompted to enter the GitHub username for which you want to retrieve repository information.
The application will display a list of non-fork repositories for the specified user, along with their branch names and last commit SHA.
If the user does not exist, the application will display an appropriate error message.
The application supports both JSON and XML responses based on the Accept header in the HTTP request.

Configuration
The application uses the GitHub API to fetch repository data. No additional configuration is required to use the public GitHub API.
If you encounter rate limiting issues, you may need to configure API authentication. Please refer to the GitHub API documentation for more details.
Contributing
Contributions to the GitHub API Consumer are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

License
This project is licensed under the MIT License.

Acknowledgments
This application was developed as part of a learning exercise and is not affiliated with or endorsed by GitHub.