package com.loki.singlemoduleapp.stub;

public class SampleClass6502 {

    private SampleClass6503 sampleClass;

    public SampleClass6502(){
        sampleClass = new SampleClass6503();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}