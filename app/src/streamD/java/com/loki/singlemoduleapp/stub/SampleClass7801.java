package com.loki.singlemoduleapp.stub;

public class SampleClass7801 {

    private SampleClass7802 sampleClass;

    public SampleClass7801(){
        sampleClass = new SampleClass7802();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}