package com.example;

import com.example.model.containers.ContainerType1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
    @GetMapping()
    public ContainerType1 sampleMethod() {
        return new ContainerType1();
    }
}
