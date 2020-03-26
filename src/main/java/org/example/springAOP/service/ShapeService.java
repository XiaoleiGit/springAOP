package org.example.springAOP.service;

import lombok.Getter;
import lombok.Setter;
import org.example.springAOP.model.Circle;
import org.example.springAOP.model.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class ShapeService {

    @Autowired
    private Circle circle;

    @Autowired
    private Triangle triangle;
}
