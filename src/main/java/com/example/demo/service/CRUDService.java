package com.example.demo.service;

import org.springframework.stereotype.Service;

public interface CRUDService<T, R> {
    R create(T value);

    T read();

    R update(T value);

    R delete(T value);
}
