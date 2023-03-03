public static int n = Integer . parseInt ( input ) {
  int i , j ;
  int k ;
  boolean [ ] p = new boolean [ k + 1 ] ;
  p [ 0 ] = false ;
  p [ 1 ] = false ;
  for ( i = 2 ;
  i <= k ;
  i ++ ) {
    if ( p [ i ] ) {
      for ( j = i * 2 ;
      j <= k ;
      j += i ) {
        p [ j ] = false ;
      }
    }
  }
  return i ;
}
