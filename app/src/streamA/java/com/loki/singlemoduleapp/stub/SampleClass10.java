package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass10 {

    @Ignore
    private SampleClass11 sampleClass;

    public SampleClass10() {
        sampleClass = new SampleClass11();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}