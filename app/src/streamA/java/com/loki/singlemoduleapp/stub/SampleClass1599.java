package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1599 {

    @Ignore
    private SampleClass1600 sampleClass;

    public SampleClass1599() {
        sampleClass = new SampleClass1600();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}