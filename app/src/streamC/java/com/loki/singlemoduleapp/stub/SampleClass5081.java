package com.loki.singlemoduleapp.stub;

public class SampleClass5081 {

    private SampleClass5082 sampleClass;

    public SampleClass5081(){
        sampleClass = new SampleClass5082();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}