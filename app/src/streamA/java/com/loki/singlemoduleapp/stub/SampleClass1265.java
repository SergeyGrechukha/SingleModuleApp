package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1265 {

    @Ignore
    private SampleClass1266 sampleClass;

    public SampleClass1265() {
        sampleClass = new SampleClass1266();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}