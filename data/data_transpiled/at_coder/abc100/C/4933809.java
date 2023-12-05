public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    while ( a [ i ] % 2 == 0 ) {
      a [ i ] = a [ i ] / 2 ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
