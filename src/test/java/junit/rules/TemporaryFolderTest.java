package junit.rules;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class TemporaryFolderTest {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@Test
	public void testWrite() throws IOException {
		
		File tempFile = folder.newFile("tempFile.txt");
		
		FileUtils.writeStringToFile(tempFile, "hello world");
		
		String s = FileUtils.readFileToString(tempFile);
		//Logger.getLogger(getClass().getName()).info(s);   
		
		assertThat("hello world", equalTo(s));
		
		//Note: File is guaranteed to be deleted after the test finishes.
	}
	
}
