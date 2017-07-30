package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1919 {

    @Ignore
    private SampleClass1920 sampleClass;

    public SampleClass1919() {
        sampleClass = new SampleClass1920();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}