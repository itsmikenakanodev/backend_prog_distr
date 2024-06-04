package com.distribuida.servicios;

import jakarta.enterprise.context.ApplicationScoped;
//equivalente al service de spring
@ApplicationScoped
public class StringServiceImpl implements StringService{
    @Override
    public String convert(String src) {
        return src.toUpperCase();
    }
}
