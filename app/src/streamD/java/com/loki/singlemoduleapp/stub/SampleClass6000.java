package com.loki.singlemoduleapp.stub;

public class SampleClass6000 {

    private SampleClass6001 sampleClass;

    public SampleClass6000(){
        sampleClass = new SampleClass6001();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}