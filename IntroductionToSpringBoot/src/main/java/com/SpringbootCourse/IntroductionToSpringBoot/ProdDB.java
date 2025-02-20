package com.SpringbootCourse.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "production")
public class ProdDB implements DB{
   public String getDB(){
        return "ProdDB is USed!";
    }
}
