package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1426 {

    @Ignore
    private SampleClass1427 sampleClass;

    public SampleClass1426() {
        sampleClass = new SampleClass1427();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}