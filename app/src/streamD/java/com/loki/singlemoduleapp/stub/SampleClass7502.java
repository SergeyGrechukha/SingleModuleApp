package com.loki.singlemoduleapp.stub;

public class SampleClass7502 {

    private SampleClass7503 sampleClass;

    public SampleClass7502(){
        sampleClass = new SampleClass7503();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}