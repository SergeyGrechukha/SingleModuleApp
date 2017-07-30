package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1637 {

    @Ignore
    private SampleClass1638 sampleClass;

    public SampleClass1637() {
        sampleClass = new SampleClass1638();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}