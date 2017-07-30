package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1139 {

    @Ignore
    private SampleClass1140 sampleClass;

    public SampleClass1139() {
        sampleClass = new SampleClass1140();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}