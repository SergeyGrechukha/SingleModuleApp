package stub;

import com.jenzz.pojobuilder.api.Builder;
import com.jenzz.pojobuilder.api.Ignore;

@Builder
public class SampleClass738 {

    @Ignore
    private SampleClass739 sampleClass;

    public SampleClass738() {
        sampleClass = new SampleClass739();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}