package com.loki.singlemoduleapp.stub;

public class SampleClass5080 {

    private SampleClass5081 sampleClass;

    public SampleClass5080(){
        sampleClass = new SampleClass5081();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}