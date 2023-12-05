static final class DistinctSubsets extends Scanner {
  private final List < String > distincNumbers ;
  private final Map < Integer , String > sumMap = Maps . newHashMap ( ) ;
  @ Override public String getAnswer ( ) {
    for ( int i = 0 ;
    i < distincNumbers . size ( ) ;
    i ++ ) {
      for ( String subset : new String [ ] {
        distincNumbers . get ( i ) }
        ) {
          int subsetSum = hash ( sum ( subset ) ) ;
          if ( sumMap . containsKey ( subsetSum ) ) {
            return "\n" + Joiner . on ( " " ) . join ( Arrays . asList ( subset ) , sumMap . get ( subsetSum ) ) ;
          }
          else {
            sumMap . put ( subsetSum , Joiner . on ( " " ) . join ( Arrays . asList ( subset ) ) ) ;
          }
        }
      }
      return "Impossible" ;
    }
    File inputFile = new File ( "/tmp/03_large.in" ) ;
    File outputFile = new File ( "/tmp/03_large.out" ) ;
    class InputReader implements Scanner {
      private final File inputFile = new File ( "/tmp/03_large.in" ) ;
      private File outputFile = new File ( "/tmp/03_large.out" ) ;
      private final File outputFile = new File ( "/tmp/03_large.out" ) ;
      private final File input = new File ( inputFile , "input.txt" ) ;
      private final File input = new File ( outputFile , "output.txt" ) ;
      private final File output = new File ( outputFile , "output.txt" ) ;
      @ Override public void run ( ) {
        initialize ( ) ;
        generateAnswer ( ) ;
        writeOutput ( ) ;
      }
      private void initialize ( ) {
        Scanner scanner = new Scanner ( input ) ;
        while ( scanner . hasNextLine ( ) ) {
          scanner . nextLine ( ) ;
        }
        scanner . close ( ) ;
      }
      private void generateAnswer ( ) {
        int caseCount = Integer . parseInt ( scanner . nextLine ( ) ) ;
        for ( int i = 1 ;
        i < caseCount ;
        i ++ ) {
          String line = scanner . nextLine ( ) ;
          String x = "Case #" + index + ":" + line + "\n" ;
          scanner . nextLine ( ) ;
          index ++ ;
        }
      }
    }
    private void writeOutput ( ) {
      try {
        PrintWriter pw = new PrintWriter ( outputFile ) ;
        pw . println ( ) ;
      }
      catch