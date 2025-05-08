package Input.InputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
  public void readChar() throws IOException {
    InputStreamReader is;

    is = new InputStreamReader(System.in);

    int asciiCode = is.read();

    System.out.println(asciiCode);
  }

}
