package com.loki.singlemoduleapp.stub;

public class SampleClass6501 {

    private SampleClass6502 sampleClass;

    public SampleClass6501(){
        sampleClass = new SampleClass6502();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}