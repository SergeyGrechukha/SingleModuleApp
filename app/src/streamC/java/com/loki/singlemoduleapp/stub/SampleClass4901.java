package com.loki.singlemoduleapp.stub;

public class SampleClass4901 {

    private SampleClass4902 sampleClass;

    public SampleClass4901(){
        sampleClass = new SampleClass4902();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}