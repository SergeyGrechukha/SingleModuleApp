package com.loki.singlemoduleapp.stub;

public class SampleClass7071 {

    private SampleClass7072 sampleClass;

    public SampleClass7071(){
        sampleClass = new SampleClass7072();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}