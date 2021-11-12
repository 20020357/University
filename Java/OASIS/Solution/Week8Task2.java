import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
  /**Throw error NullPointerException. */
  void nullPointerEx() throws NullPointerException {
    throw new NullPointerException("Lỗi Null Pointer");
  }

  /**Catch error NullPointerException. */
  String nullPointerExTest() {
    try {
      nullPointerEx();
    } catch (Exception e) {
      //TODO: handle exception
      return e.getMessage();
    }
    return "Không có lỗi";
  }

  /**Throw error ArrayIndexOutOfBoundsException. */
  void arrayIndexOutBoundsEx() throws ArrayIndexOutOfBoundsException {
    throw new ArrayIndexOutOfBoundsException("Lỗi Array Index Out of Bounds");
  }

  /**Catch error ArrayIndexOutOfBoundsException. */
  String arrayIndexOutOfBoundsExTest() {
    try {
      arrayIndexOutBoundsEx();
    } catch (Exception e) {
      //TODO: handle exception
      return e.getMessage();
    }
    return "Không có lỗi";
  }

  /**Throw error ArithmeticException. */
  void arithmeticEx() throws ArithmeticException {
    throw new ArithmeticException("Lỗi Arithmetic");
  }

  /**Catch error ArithmeticException. */
  String arithmeticExTest() {
    try {
      arithmeticEx();
    } catch (Exception e) {
      //TODO: handle exception
      return e.getMessage();
    }

    return "Không có lỗi";
  }

  /**Throw error FileNotFoundException. */
  void fileNotFoundEx() throws FileNotFoundException {
    throw new FileNotFoundException("Lỗi File Not Found");
  }

  /**Catch error FileNotFoundException. */
  String fileNotFoundExTest() {
    try {
      fileNotFoundEx();
    } catch (Exception e) {
      //TODO: handle exception
      return e.getMessage();
    }
    return "Không có lỗi";
  }

  /**Throw error IOException. */
  void ioEx() throws IOException {
    throw new IOException("Lỗi IO");
  }

  /**Catch error IOException. */
  String ioExTest() {
    try {
      ioEx();
    } catch (Exception e) {
      //TODO: handle exception
      return e.getMessage();
    }
    return "Không có lỗi";
  }
}
