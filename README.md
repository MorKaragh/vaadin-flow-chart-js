# vaadin-flow-chart-js
Demo application with chart.js samples wrapped in Vaadin Flow components

### how to run
This application requires node.js & npm to be installed.
You can install it either by:
 1) following the https://nodejs.org/en/download/ guide to install it globally. This is the recommended way.
 2) running the following Maven plugin goal to install it in this project:
    ```
    mvn com.github.eirslett:frontend-maven-plugin:1.7.6:install-node-and-npm -DnodeVersion="v12.14.0"  ```
 
 after this, just run ```mvn spring-boot:run```. The application will be deployed to localhost:8080
 
 All of the sample charts are confifured in ```DemoUi.java```

