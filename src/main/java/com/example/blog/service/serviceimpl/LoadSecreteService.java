package com.example.blog.service.serviceimpl;

import io.github.cdimascio.dotenv.Dotenv;

import java.util.HashMap;
import java.util.Map;



public class LoadSecreteService {
//    dev

//    Dotenv dotenv = Dotenv.configure().load();
//    public Map<String,String> loadSecret(){
//        Map<String,String> secret =  new HashMap(){{
//            put("API_KEY",dotenv.get("API_KEY"));
//            put("DB_HOST",dotenv.get("DB_HOST"));
//            put("DB_USER",dotenv.get("DB_USER"));
//            put("DB_NAME",dotenv.get("DB_NAME"));
//            put("DB_PASSWORD",dotenv.get("DB_PASSWORD"));
//        }};
//   return secret;
//    };

    //prod

    public Map<String,String> loadSecret(){
                Map<String,String> secret =  new HashMap(){{
            put("API_KEY",System.getenv("API_KEY"));
            put("DB_HOST",System.getenv("DB_HOST"));
            put("DB_USER",System.getenv("DB_USER"));
            put("DB_NAME",System.getenv("DB_NAME"));
            put("DB_PASSWORD",System.getenv("DB_PASSWORD"));
        }};
   return secret;
   }

}
