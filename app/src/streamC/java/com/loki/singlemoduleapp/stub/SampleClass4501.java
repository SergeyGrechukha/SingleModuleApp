package com.loki.singlemoduleapp.stub;

public class SampleClass4501 {

    private SampleClass4502 sampleClass;

    public SampleClass4501(){
        sampleClass = new SampleClass4502();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}