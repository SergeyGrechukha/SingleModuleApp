package com.loki.singlemoduleapp.stub;

public class SampleClass4602 {

    private SampleClass4603 sampleClass;

    public SampleClass4602(){
        sampleClass = new SampleClass4603();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}