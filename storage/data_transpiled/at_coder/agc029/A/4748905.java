public static void print ( String S ) {
  int [ ] W_i = new int [ S . length ( ) ] ;
  for ( int i = 0 ;
  i < W_i . length ;
  i ++ ) {
    W_i [ i ] = i ;
  }
  int W_n = S . length ( ) ;
  int cur = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < W_n ;
  i ++ ) {
    ans += W_i [ i ] - cur ;
    cur ++ ;
  }
  System . out . println ( ans ) ;
}
