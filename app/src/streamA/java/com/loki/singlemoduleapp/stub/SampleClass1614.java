package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1614 {

    @Ignore
    private SampleClass1615 sampleClass;

    public SampleClass1614() {
        sampleClass = new SampleClass1615();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}