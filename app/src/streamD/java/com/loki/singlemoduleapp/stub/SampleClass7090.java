package com.loki.singlemoduleapp.stub;

public class SampleClass7090 {

    private SampleClass7091 sampleClass;

    public SampleClass7090(){
        sampleClass = new SampleClass7091();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}