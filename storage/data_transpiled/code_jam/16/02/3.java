public static void main ( String [ ] args ) {
  try {
    int cases = Integer . parseInt ( args [ 0 ] ) ;
    BufferedReader br = new BufferedReader ( new FileReader ( "/home/gauravjs/Documents/Google Code Jam/2016Q/B-large.in" ) ) ;
    String line = br . readLine ( ) ;
    for ( int i = 0 ;
    i < cases ;
    i ++ ) {
      int n = 0 ;
      if ( line . charAt ( line . length ( ) - 2 ) == '-' ) n ++ ;
      char s = line . charAt ( line . length ( ) - 2 ) ;
      for ( int j = line . length ( ) - 3 ;
      j >= 0 ;
      j -- ) {
        if ( line . charAt ( j ) != s ) {
          s = line . charAt ( j ) ;
          n ++ ;
        }
      }
      System . out . println ( "Case #" + ( i + 1 ) + ": " + n ) ;
    }
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
}
