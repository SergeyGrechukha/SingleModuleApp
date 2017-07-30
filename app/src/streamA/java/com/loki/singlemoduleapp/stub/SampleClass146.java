package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass146 {

    @Ignore
    private SampleClass147 sampleClass;

    public SampleClass146() {
        sampleClass = new SampleClass147();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}