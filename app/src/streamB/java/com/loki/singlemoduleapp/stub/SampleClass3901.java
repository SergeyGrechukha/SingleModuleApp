package stub;

public class SampleClass3901 {

    private SampleClass3902 sampleClass;

    public SampleClass3901(){
        sampleClass = new SampleClass3902();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}