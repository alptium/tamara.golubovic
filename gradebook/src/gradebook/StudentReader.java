package gradebook;

import java.io.IOException;
import java.util.ArrayList;

public interface StudentReader {
	ArrayList<Student> read()  throws IOException;
}
