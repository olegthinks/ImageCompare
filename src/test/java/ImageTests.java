import base.BaseTests;
import base.EyesManager;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class ImageTests extends BaseTests {
    @Test
    public void testImages() throws IOException, InterruptedException {
        String destination = "resources/Images/" + "test.jpg";

        Assert.assertTrue("Error validating Image", EyesManager.validate(destination));
    }

}


