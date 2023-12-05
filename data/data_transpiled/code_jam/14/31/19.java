@ VisibleForTesting static void print ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final File fout = new File ( "out.txt" ) ;
  final int n = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final String line = scanner . nextLine ( ) ;
    int p = Integer . parseInt ( line . trim ( ) ) ;
    int q = Integer . parseInt ( line . trim ( ) ) ;
    int x = gcd ( p , q ) ;
    p /= x ;
    q /= x ;
    int k = 0 , ss = 1 ;
    String res = "" ;
    while ( k < 41 && ss * p % q != 0 ) {
      k ++ ;
      ss *= 2 ;
      if ( ss * p >= q && res . equals ( "" ) ) {
        res = k ;
      }
    }
    if ( k == 41 ) {
      res = "impossible" ;
    }
    System . out . println ( >>> fout . getAbsolutePath ( ) + "Case #" + ( i + 1 ) + ": " + res ) ;
  }
  scanner . close ( ) ;
}
