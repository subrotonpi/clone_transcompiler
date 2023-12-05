static final int [ ] [ ] getNegativeInstances ( ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k == 1 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  int n = Math . ceil ( k / 4 ) * 2 ;
  int [ ] [ ] ans = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] tmp = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i % 2 == 0 ) {
        tmp [ j ] = ( i + j ) % n + 1 ;
      }
      else {
        tmp [ j ] = n + ( i + j ) % n + 1 ;
      }
    }
    ans [ i ] [ j ] = tmp ;
  }
  int kazu = n * 2 ;
  while ( kazu != k ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( ans [ i ] [ j ] == kazu ) {
          ans [ i ] [ j ] -= n ;
        }
      }
    }
    kazu -- ;
  }
  System . out . println ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( ( ( Integer ) ans [ i ] [ i ] ) . intValue ( ) ) ;
  }
  return ans ;
}
