public static int limit = 1000000 ;
try {
  int cases = Integer . parseInt ( "/home/gauravjs/Documents/Google Code Jam/2016Q/A-large.in" ) ;
  BufferedReader reader = new BufferedReader ( new FileReader ( "/home/gauravjs/Documents/Google Code Jam/2016Q/A-large.in" ) ) ;
  String line ;
  String [ ] lines = new String [ cases ] ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    line = reader . readLine ( ) ;
  }
  int [ ] inputs = new int [ cases ] ;
  for ( int i = 0 ;
  i < cases ;
  i ++ ) {
    int n = Integer . parseInt ( lines [ i ] ) ;
    int m = n ;
    Set < Integer > digits = new HashSet < Integer > ( ) ;
    while ( ( m < n * limit ) && digits . size ( ) < 10 ) {
      int q = m ;
      while ( q > 0 ) {
        digits . add ( q % 10 ) ;
        q = q / 10 ;
      }
      m += n ;
    }
    if ( digits . size ( ) == 10 ) {
      System . out . println ( "Case #" + ( i + 1 ) + ": " + ( m - n ) ) ;
    }
    else {
      System . out . println ( "Case #" + ( i + 1 ) + ": INSOMNIA" ) ;
    }
  }
  return inputs [ 0 ] ;
}
