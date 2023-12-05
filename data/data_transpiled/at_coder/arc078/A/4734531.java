public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] S = new int [ N ] ;
  S [ 0 ] = 0 ;
  int s = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    s += a [ i ] ;
    S [ i ] = s ;
  }
  int ans = 10 * 28 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    ans = Math . min ( Math . abs ( S [ N ] - 2 * S [ i ] ) , ans ) ;
  }
  System . out . println ( ans ) ;
}
