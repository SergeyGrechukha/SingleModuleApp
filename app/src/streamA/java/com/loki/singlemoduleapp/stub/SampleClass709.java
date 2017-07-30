package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass709 {

    @Ignore
    private SampleClass710 sampleClass;

    public SampleClass709() {
        sampleClass = new SampleClass710();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}