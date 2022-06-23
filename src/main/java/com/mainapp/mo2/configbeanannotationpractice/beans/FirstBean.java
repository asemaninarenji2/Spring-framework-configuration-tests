package com.mainapp.mo2.configbeanannotationpractice.beans;

import lombok.Data;

@Data
public class FirstBean {
    public String print() {
        return "From FirstBean";
    }
}
