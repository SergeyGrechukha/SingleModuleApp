package com.loki.singlemoduleapp.stub;

public class SampleClass6302 {

    private SampleClass6303 sampleClass;

    public SampleClass6302(){
        sampleClass = new SampleClass6303();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}