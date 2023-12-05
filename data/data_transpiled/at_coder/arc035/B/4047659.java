public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] T = new int [ 10001 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int t = Integer . parseInt ( input ) ;
    T [ t ] ++ ;
  }
  int anst = 0 ;
  int ansp = 1 ;
  int t = 0 ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) {
    if ( T [ i ] >= 1 ) {
      for ( int j = 1 ;
      j <= T [ i ] ;
      j ++ ) {
        anst += t + i ;
        t += i ;
        ansp *= j ;
        ansp %= ( 10 * 9 + 7 ) ;
      }
    }
  }
  System . out . println ( anst ) ;
  System . out . println ( ansp ) ;
}
