package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass163 {

    @Ignore
    private SampleClass164 sampleClass;

    public SampleClass163() {
        sampleClass = new SampleClass164();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}