package stub;

public class SampleClass3221 {

    private SampleClass3222 sampleClass;

    public SampleClass3221(){
        sampleClass = new SampleClass3222();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}