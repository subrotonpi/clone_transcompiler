public static final void main ( String [ ] args ) {
  if ( args . length == 0 ) {
    int T = Integer . parseInt ( args [ 0 ] ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      int n = Integer . parseInt ( args [ 1 ] ) ;
      int maxC = Integer . parseInt ( args [ 2 ] ) ;
      Stack < Integer > sz = new Stack < > ( ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        sz . push ( i ) ;
      }
      Collections . sort ( sz ) ;
      int discNeed = 0 ;
      while ( sz . size ( ) > 0 ) {
        discNeed = discNeed + 1 ;
        int tail = sz . pop ( ) ;
        if ( sz . size ( ) > 0 ) {
          if ( tail + sz . get ( 0 ) <= maxC ) {
            for ( int i = 0 ;
            i < sz . size ( ) ;
            i ++ ) {
              if ( tail + sz . get ( i ) <= maxC ) {
                sz = sz . subList ( 0 , i ) + sz . subList ( i + 1 , sz . size ( ) ) ;
                break ;
              }
            }
          }
        }
      }
      System . out . println ( "Case #" + ( t + 1 ) + ": " + discNeed ) ;
    }
  }
}
