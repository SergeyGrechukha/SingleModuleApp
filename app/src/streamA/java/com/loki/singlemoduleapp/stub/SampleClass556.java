package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass556 {

    @Ignore
    private SampleClass557 sampleClass;

    public SampleClass556() {
        sampleClass = new SampleClass557();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}