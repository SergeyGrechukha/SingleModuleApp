package stub;

public class SampleClass2101 {

    private SampleClass2102 sampleClass;

    public SampleClass2101(){
        sampleClass = new SampleClass2102();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}