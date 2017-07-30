package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1996 {

    @Ignore
    private SampleClass1997 sampleClass;

    public SampleClass1996() {
        sampleClass = new SampleClass1997();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}