package Input.InputStream;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput2 {
  public void readTwoChars() throws IOException {
    InputStreamReader is;
    is = new InputStreamReader(System.in);

    System.out.println(is.read());
    System.out.println(is.read());

  }

}
