package com.loki.singlemoduleapp.stub;

public class SampleClass4531 {

    private SampleClass4532 sampleClass;

    public SampleClass4531(){
        sampleClass = new SampleClass4532();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}