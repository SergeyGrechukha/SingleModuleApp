package com.loki.singlemoduleapp.stub;

public class SampleClass6082 {

    private SampleClass6083 sampleClass;

    public SampleClass6082(){
        sampleClass = new SampleClass6083();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}