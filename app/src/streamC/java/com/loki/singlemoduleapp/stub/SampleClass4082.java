package com.loki.singlemoduleapp.stub;

public class SampleClass4082 {

    private SampleClass4083 sampleClass;

    public SampleClass4082(){
        sampleClass = new SampleClass4083();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}