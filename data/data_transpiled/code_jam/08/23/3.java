@ AfterClass public static void testSuite ( ) throws IOException {
  String testCase = "small-attempt0" ;
  String inputFile = "C-" + testCase + ".in" ;
  String outputFile = "C-" + testCase + ".out" ;
  BufferedReader fin = new BufferedReader ( new FileReader ( inputFile ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( outputFile ) ) ) ;
  int ncase = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
  for ( int z = xrange ( 1 , ncase + 1 ) ;
  z <= ncase ;
  z ++ ) {
    print >> fout . println ( "Case #" + z + ":" ) ;
    int k = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int [ ] d = new int [ k ] ;
    for ( int x = 0 ;
    x < d . length ;
    x ++ ) d [ x ] = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) - 1 ;
    for ( int dd : d ) {
      int n = k , p = dd , r = 0 , i = 1 ;
      while ( p != r ) {
        n -- ;
        if ( p > r ) p -- ;
        r = ( r + i ) % n ++ ;
      }
      print >> fout . println ( i + "," ) ;
    }
    print >> fout . println ( ) ;
  }
  fin . close ( ) ;
  fout . close ( ) ;
}
