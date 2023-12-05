static final void main ( String [ ] args ) throws IOException {
  final String FILE_NAME = "B-small-attempt0" ;
  final String INPUT_FILE = FILE_NAME + ".in" ;
  final String OUTPUT_FILE = FILE_NAME + ".out" ;
  /* Area of the input file */
  int x1 = 0 ;
  int y1 = 0 ;
  for ( int x2 = 0 ;
  x2 < n ;
  x2 ++ ) {
    for ( int y2 = 0 ;
    y2 < m ;
    y2 ++ ) {
      for ( int x3 = 0 ;
      x3 < n ;
      x3 ++ ) {
        for ( int y3 = 0 ;
        y3 < m ;
        y3 ++ ) {
          if ( area_mul2 ( x1 , y1 , x2 , y2 , x3 , y3 ) == a ) {
            System . out . println ( "Case #" + testCase + ": " + x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3 ) ;
            return ;
          }
        }
      }
    }
    System . out . println ( "Case #" + testCase + ": IMPOSSIBLE" ) ;
  }
  /* Main program */
  final Scanner fpIn = new Scanner ( new File ( INPUT_FILE ) ) ;
  final PrintWriter fpOut = new PrintWriter ( new BufferedWriter ( new FileWriter ( OUTPUT_FILE ) ) ) ;
  System . in . useLocale ( Locale . US ) ;
  final int numCases = Integer . parseInt ( input ( args [ 0 ] ) ) ;
  for ( int testCase = 1 ;
  testCase <= numCases ;
  testCase ++ ) {
    final int n = Integer . parseInt ( input ( args [ 0 ] ) ) ;
    final int m = Integer . parseInt ( input ( args [ 1 ] ) ) ;
    final int a = Integer . parseInt ( input ( args [ 2 ] ) ) ;
    process ( testCase , n , m , a ) ;
  }
  fpIn . close ( ) ;
  fpOut . close ( ) ;
}
