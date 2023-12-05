public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int max = Arrays . stream ( a ) . mapToInt ( Integer :: max ) . toArray ( ) ;
  int s = a [ 0 ] ;
  int ans = Math . abs ( 2 * s - max ) ;
  for ( int i = 1 ;
  i < N - 1 ;
  i ++ ) {
    s += a [ i ] ;
    ans = Math . min ( ans , Math . abs ( 2 * s - max ) ) ;
  }
  System . out . println ( ans ) ;
}
