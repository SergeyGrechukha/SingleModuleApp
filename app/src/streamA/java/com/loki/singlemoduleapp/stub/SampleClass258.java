package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass258 {

    @Ignore
    private SampleClass259 sampleClass;

    public SampleClass258() {
        sampleClass = new SampleClass259();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}