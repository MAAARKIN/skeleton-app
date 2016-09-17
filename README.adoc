=== Description

This project is an Spring Boot multimodule application with the following structure.

[source]
----
.
├── skeleton-service
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── br
│           │       └── com
│           │       	└── skeleton
│           │           	├── SkeletonApplication.java
│           │           	├── HelloService.java
│           └── resources
│               ├── application.properties
│               └── templates
│                   └── welcome
│                       └── show.html
├── skeleton-model
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── br
│               	└── com
│                       └── skeleton
│                           └── User.java
├── skeleton-repository
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── br
│               	└── com
│                       └── skeleton
│                           └── UserRepository.java
└── skeleton-business
    ├── pom.xml
    └── src
        └── main
            └── java
                └── br
                    └── com
                        └── skeleton
                            └── UserBusiness.java
                            
----