package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1894 {

    @Ignore
    private SampleClass1895 sampleClass;

    public SampleClass1894() {
        sampleClass = new SampleClass1895();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}