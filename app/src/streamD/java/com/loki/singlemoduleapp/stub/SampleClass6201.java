package com.loki.singlemoduleapp.stub;

public class SampleClass6201 {

    private SampleClass6202 sampleClass;

    public SampleClass6201(){
        sampleClass = new SampleClass6202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}