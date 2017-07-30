package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1346 {

    @Ignore
    private SampleClass1347 sampleClass;

    public SampleClass1346() {
        sampleClass = new SampleClass1347();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}