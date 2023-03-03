public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i < n - 2 ;
  i ++ ) {
    if ( a [ i - 1 ] == a [ i ] ) {
      a [ i ] = - 1 ;
      ans ++ ;
    }
  }
}
