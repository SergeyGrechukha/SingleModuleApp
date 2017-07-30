package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1871 {

    @Ignore
    private SampleClass1872 sampleClass;

    public SampleClass1871() {
        sampleClass = new SampleClass1872();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}