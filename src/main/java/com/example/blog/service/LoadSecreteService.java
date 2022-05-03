package com.example.blog.service;

import java.util.Map;

public interface LoadSecreteService {
    public Map<String,String> loadProdSecret();
    public Map<String,String> loadDevSecret();
}
