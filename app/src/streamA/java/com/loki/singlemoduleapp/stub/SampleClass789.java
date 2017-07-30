package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass789 {

    @Ignore
    private SampleClass790 sampleClass;

    public SampleClass789() {
        sampleClass = new SampleClass790();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}