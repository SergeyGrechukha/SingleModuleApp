package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1138 {

    @Ignore
    private SampleClass1139 sampleClass;

    public SampleClass1138() {
        sampleClass = new SampleClass1139();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}