package com.loki.singlemoduleapp.stub;

public class SampleClass4008 {

    private SampleClass4009 sampleClass;

    public SampleClass4008(){
        sampleClass = new SampleClass4009();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}