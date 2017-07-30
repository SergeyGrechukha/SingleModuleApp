package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1913 {

    @Ignore
    private SampleClass1914 sampleClass;

    public SampleClass1913() {
        sampleClass = new SampleClass1914();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}