package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1840 {

    @Ignore
    private SampleClass1841 sampleClass;

    public SampleClass1840() {
        sampleClass = new SampleClass1841();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}