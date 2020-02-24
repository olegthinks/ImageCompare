## Initial implementation of ImageTester from Applitools which integrates with the Applitools platform in order to compare images and PDFs. 


# Image Compare
1. Login or create an account with Applitools (https://applitools.com/users/login).
2. Retrieve the platform API key within My Profile -> My API Key
3. Add your API key into 'test.properties'
4. Copy your baselines into 'ImagesBaseline'
5. Copy your test images into 'Images'
6. Run 'ImageComparison'


# Process
The TestNG test 'ImageComparison' reviews files within two directories, initally for creation of the baselines ('ImagesBaseline') and then against to run potential different images in this demo implementation.


# Notes
Applitools Eyes works on the premise that all anamolies detected require manual user confirmation in order to fianlly confirm a 'Fail' result.
This tool automatically groups images by file name (and creates a new test batch) so no prerequisite setup should be required to start using this tool.


# Console print outs depending on whether you have a match or a difference detected. 
Matching: 
    Baseline.jpg
    ImageTester version 1.3.0 
    [1/1] Test finished, Existing test [ steps: 1, test name: Baseline.jpg, matches: 1, mismatches:0, missing: 0] , URL:              https://eyes.applitools.com/.................
    
Difference detected:
    ColorAdjustment.jpg
    ImageTester version 1.3.0 
    [1/1] Unexpected error, java.util.concurrent.ExecutionException, com.applitools.eyes.exceptions.DiffsFoundException: Test       'ColorAdjustment.jpg' of 'ImageTester' detected differences! See details at: https://eyes.applitools.com/..............


# References 
- https://help.applitools.com/hc/en-us/articles/360007188551-Image-Tester-Stand-alone-tool-for-images-comparison

