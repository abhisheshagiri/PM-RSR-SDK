# PM-RSR-SDK
This repo is a sample to test a SDK feature that can work on its own without any other dependency

## How to clone this repo?
Clone this repository using,

```
git@github.com:abhisheshagiri/PM-RSR-SDK.git
```

## How to generate the SDK from this project?
1. Open a new Android Studio Project with Empty Activity

2. After the build finishes, Navigate to File → New → New Module

3. This now opens a new window to create a “New Module”. Now click on “Android Library” name the new module and click on “Finish” 

4. This now creates a new module within the project that would be able to take all the code that we want to export as a library/SDK

5. (Only for Jitpack) Now, we need to add the following to our :app level build.gradle to enable the Jitpack to generate the required artifacts
Code:

The following line within the plugins{}block

```
id 'maven-publish'
```

The following would be below dependencies{} block
```
afterEvaluate {
    publishing {
        publications {
            release(MavenPublication) {
                from components.release_apk
                groupId = 'com.github.abhisheshagiri'
                artifactId = 'pm-rsr-demo'
                version = '1.0'
            }
        }
    }
}
```
6. From the above snippet,

  ```groupId``` is the value of your GitHub profile

  ```artifactId``` is the name given to the project

  ```version``` is the name given to the current release version

7. Now, push this project to the Github repo

8. After pushing the project on Github, we need to create a release tag by following the steps below

  1. click on “Releases” on the right side of the screen on the GitHub repo

  2. Enter the release name and all other details required and Click on Publish Release

  3. After creating a release, it should be set to the latest on that branch

  4. Now to generate the SDK, go to the Jitpack.io website and enter the link to the Github repo which would then fetch all the release tags associated with that repo
 
  5. Now click on “Get it” to start generating the artifact for the latest tag. If the artifacts are generated without errors, there will be a “Green File Icon” that would be shown under “Log” for that version with detailed instruction on how to import it


