package com.loki.singlemoduleapp.stub;

public class SampleClass7081 {

    private SampleClass7082 sampleClass;

    public SampleClass7081(){
        sampleClass = new SampleClass7082();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}