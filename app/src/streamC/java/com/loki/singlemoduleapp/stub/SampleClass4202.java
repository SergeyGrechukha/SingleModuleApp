package com.loki.singlemoduleapp.stub;

public class SampleClass4202 {

    private SampleClass4203 sampleClass;

    public SampleClass4202(){
        sampleClass = new SampleClass4203();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}