public static void input ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    int a = S [ i ] ;
    int b = S [ i + 1 ] ;
    if ( a != b ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
