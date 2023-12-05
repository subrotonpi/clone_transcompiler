public static void main ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] p = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = 0 ;
  int i = 0 ;
  while ( i < N ) {
    if ( p [ i ] == i + 1 ) {
      ans ++ ;
      if ( i < N - 1 && p [ i + 1 ] == i + 2 ) {
        i ++ ;
      }
    }
    i ++ ;
  }
  System . out . println ( ans ) ;
}
