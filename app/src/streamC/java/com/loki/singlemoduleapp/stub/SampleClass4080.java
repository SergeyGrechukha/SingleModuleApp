package com.loki.singlemoduleapp.stub;

public class SampleClass4080 {

    private SampleClass4081 sampleClass;

    public SampleClass4080(){
        sampleClass = new SampleClass4081();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}