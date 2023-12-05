public static void main ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = - 1 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( c [ i ] % c [ j ] == 0 ) {
        k ++ ;
      }
    }
    if ( k % 2 == 0 ) {
      ans += ( k + 2 ) / ( 2 * k + 2 ) ;
    }
    else {
      ans += 1 / 2 ;
    }
  }
  System . out . println ( ans ) ;
}
