# Koin Singleton Bug Sample Project

In Hilt, if we mark a class as Singleton, then the instance remains the same as long as the app process is active. It should be the same for Koin too. If a configuration change happens, then a new object should not be created.  


## Observations
Using Koin: The Singleton object is created again when a configuration change happens.
Using Hilt: The Singleton object truly remains singleton, even when a configuration change happens.

| Koin | Hilt |
|--------|--------|
|  <video src ="https://github.com/user-attachments/assets/466ceea7-8519-462d-ab97-425e280aba6d"> | <video src ="https://github.com/user-attachments/assets/90dbc1d2-1223-43af-8f4e-17afc032e9f1">  | 

## Instructions to Reproduce the Issue
To reproduce the issue with Singleton behavior in Koin and Hilt, follow these steps:  

- Clone the Repository:  
git clone https://github.com/ksharma-xyz/KoinSingletonBug.git

- Testing Koin `git checkout main`
- Testing Hilt  `git checkout hilt`

- Open the Project in Android Studio
- Run the Application:  
- Observe the Logs:  
- Perform a configuration change (e.g., rotate the device / switch theme).
- Observe the logs to see if a new instance of the Singleton class `RealRepository` is being created.


