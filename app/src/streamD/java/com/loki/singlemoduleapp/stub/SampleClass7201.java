package com.loki.singlemoduleapp.stub;

public class SampleClass7201 {

    private SampleClass7202 sampleClass;

    public SampleClass7201(){
        sampleClass = new SampleClass7202();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}