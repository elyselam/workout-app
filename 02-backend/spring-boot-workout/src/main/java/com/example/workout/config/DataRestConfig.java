//package com.example.workout.config;
//
//import com.example.workout.entity.Exercise;
//import com.example.workout.entity.Routine;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//
//import org.springframework.http.HttpMethod;
//
//@Configuration
//public class DataRestConfig {
//    @Override
//    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//
//        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PATCH};
//
//        // disable HTTP methods for Product: PUT, POST, DELETE and PATCH
//        config.getExposureConfiguration()
//                .forDomainType(Exercise.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
//
//        // disable HTTP methods for ProductCategory: PUT, POST, DELETE and PATCH
//        config.getExposureConfiguration()
//                .forDomainType(Routine.class)
//                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
//                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));
//
//    }

//}
