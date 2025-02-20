package com.SpringbootCourse.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "development")
public class DevDB implements DB {
   public String getDB(){
        return "DevDB is Used!";
    }
}
