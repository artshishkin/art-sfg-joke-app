package com.artarkatesoft.artsfgjokeapp.services;

import org.springframework.stereotype.Service;

@Service
public class StaticJokeService implements JokeService {
    @Override
    public String getJoke() {
        return "Hahaha";
    }
}
