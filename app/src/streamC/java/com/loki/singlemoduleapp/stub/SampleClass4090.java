package com.loki.singlemoduleapp.stub;

public class SampleClass4090 {

    private SampleClass4091 sampleClass;

    public SampleClass4090(){
        sampleClass = new SampleClass4091();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}