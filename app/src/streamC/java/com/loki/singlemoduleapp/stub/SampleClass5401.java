package com.loki.singlemoduleapp.stub;

public class SampleClass5401 {

    private SampleClass5402 sampleClass;

    public SampleClass5401(){
        sampleClass = new SampleClass5402();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}