package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1872 {

    @Ignore
    private SampleClass1873 sampleClass;

    public SampleClass1872() {
        sampleClass = new SampleClass1873();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}