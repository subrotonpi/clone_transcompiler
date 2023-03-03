@ VisibleForTesting static int from ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  /* power of n by k */
  if ( k == 0 ) return 1 ;
  else if ( k == 1 ) return n ;
  else if ( k % 2 == 0 ) return power ( ( n * n ) % mod , k / 2 ) ;
  else return ( n * power ( n , k - 1 ) ) % mod ;
  if ( a [ 0 ] != 0 || a . length != 1 ) System . out . println ( 0 ) ;
  else {
    int [ ] c = a , ans = 1 , num = 1 , mod = 10 * 9 + 7 ;
    for ( int i = 1 ;
    i <= max ( a ) ;
    i ++ ) {
      if ( c [ i ] == 0 ) {
        ans = 0 ;
        break ;
      }
      else {
        ans = ( ans * power ( ( power ( 2 , num ) - 1 ) , c [ i ] ) * power ( 2 , c [ i ] * ( c [ i ] - 1 ) / 2 ) ) % mod ;
        num = c [ i ] ;
      }
    }
    System . out . println ( ans ) ;
  }
}
