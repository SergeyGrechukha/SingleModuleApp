package com.loki.singlemoduleapp.stub;

public class SampleClass4010 {

    private SampleClass4011 sampleClass;

    public SampleClass4010(){
        sampleClass = new SampleClass4011();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}