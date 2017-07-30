package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1196 {

    @Ignore
    private SampleClass1197 sampleClass;

    public SampleClass1196() {
        sampleClass = new SampleClass1197();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}