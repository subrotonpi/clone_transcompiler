public static final void main ( String [ ] args ) throws IOException {
  if ( args . length == 0 ) {
    int T = Integer . parseInt ( args [ 0 ] ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      int n = Integer . parseInt ( args [ t ] ) ;
      int [ ] plate = ArrayUtil . splitByLines ( args , n ) ;
      int mintime = 10000 ;
      for ( int ct = 1 ;
      ct < 1001 ;
      ct ++ ) {
        int sptime = 0 ;
        for ( int a : plate ) {
          sptime = sptime + ( a - 1 ) / ct ;
        }
        mintime = Math . min ( mintime , ct + sptime ) ;
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + mintime ) ;
    }
  }
}
