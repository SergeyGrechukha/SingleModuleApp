package stub;

import com.jenzz.pojobuilder.api.Builder;

@Builder
public class SampleClass1999 {

    public String getClassName() {
        return this.getClass().getSimpleName();
    }
}