public static int getRank ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] b = new int [ n ] ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    b [ i ] = 0 ;
    if ( a [ i ] > 0 ) {
      c [ i ] = 0 ;
    }
    else {
      c [ i ] = 0 ;
    }
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < n - k + 1 ;
  i ++ ) {
    int w ;
    if ( b [ i + k ] - b [ i ] > 0 ) {
      w = b [ i + k ] - b [ i ] + ( c [ i ] - c [ 0 ] ) + ( c [ n ] - c [ i + k ] ) ;
    }
    else {
      w = c [ i ] - c [ 0 ] + c [ n ] - c [ i + k ] ;
    }
    res = Math . max ( res , w ) ;
  }
  System . out . println ( res ) ;
  return res ;
}
