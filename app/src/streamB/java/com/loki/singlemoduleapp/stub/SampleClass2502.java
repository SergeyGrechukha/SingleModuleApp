package stub;

public class SampleClass2502 {

    private SampleClass2503 sampleClass;

    public SampleClass2502(){
        sampleClass = new SampleClass2503();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}