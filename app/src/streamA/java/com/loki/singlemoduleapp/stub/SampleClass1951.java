package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1951 {

    @Ignore
    private SampleClass1952 sampleClass;

    public SampleClass1951() {
        sampleClass = new SampleClass1952();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}