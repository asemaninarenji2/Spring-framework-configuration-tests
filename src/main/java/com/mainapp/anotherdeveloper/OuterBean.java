package com.mainapp.anotherdeveloper;

import org.springframework.stereotype.Service;

@Service
public class OuterBean {
    public String print(){
        return "FROM OUTER PACKAGE";
    }
}
