public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  int aAll = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    aAll = aAll * a [ i ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans += ( aAll - 1 ) % a [ i ] ;
  }
  System . out . println ( ans ) ;
}
