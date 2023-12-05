static final String solve ( ) {
  if ( className == null ) {
    return "" ;
  }
  int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . print ( "Case #" + ( i + 1 ) + ": " ) ;
    n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    List < Integer > l = map . get ( n ) ;
    int m = Collections . max ( l ) ;
    int ans = m ;
    for ( int i = 1 ;
    i <= m ;
    i ++ ) {
      int d = 0 ;
      for ( int p : l ) {
        if ( p > i ) {
          d = d + ( int ) Math . ceil ( p / ( double ) i ) - 1 ;
        }
      }
      ans = Math . min ( ans , d + i ) ;
    }
    System . out . println ( ans ) ;
  }
  return "" ;
}
