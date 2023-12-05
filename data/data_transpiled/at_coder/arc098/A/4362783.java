public static int solve ( String string ) {
  int length = string . length ( ) ;
  int [ ] east = new int [ length + 1 ] , west = new int [ length + 2 ] ;
  for ( int i = 1 ;
  i <= length ;
  i ++ ) {
    if ( string . charAt ( i - 1 ) == 'W' ) {
      east [ i ] = east [ i - 1 ] + 1 ;
    }
    else {
      east [ i ] = east [ i - 1 ] ;
    }
  }
  for ( int j = length ;
  j > 0 ;
  j -- ) {
    if ( string . charAt ( j - 1 ) == 'E' ) {
      west [ j ] = west [ j + 1 ] + 1 ;
    }
    else {
      west [ j ] = west [ j + 1 ] ;
    }
  }
  int ans = length ;
  for ( int k = 1 ;
  k <= length ;
  k ++ ) {
    ans = Math . min ( ans , east [ k - 1 ] + west [ k + 1 ] ) ;
  }
  return ans ;
}
