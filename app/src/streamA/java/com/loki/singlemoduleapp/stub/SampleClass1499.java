package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass1499 {

    @Ignore
    private SampleClass1500 sampleClass;

    public SampleClass1499() {
        sampleClass = new SampleClass1500();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}