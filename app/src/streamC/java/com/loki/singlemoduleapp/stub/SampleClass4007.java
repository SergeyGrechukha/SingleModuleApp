package com.loki.singlemoduleapp.stub;

public class SampleClass4007 {

    private SampleClass4008 sampleClass;

    public SampleClass4007(){
        sampleClass = new SampleClass4008();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}