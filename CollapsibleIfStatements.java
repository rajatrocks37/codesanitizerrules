public class CollapsibleIfStatements {
  public static void main(String[] args) {
  File file = new File(".");
    if (file != null) {
      if (file.isFile() || file.isDirectory()) {
          /* ... */
      }
  }
  }
}
