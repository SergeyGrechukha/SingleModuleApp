package stub;

public class SampleClass2602 {

    private SampleClass2603 sampleClass;

    public SampleClass2602(){
        sampleClass = new SampleClass2603();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}