public static void input ( ) {
  int num = 0 , cnt = 0 ;
  for ( int k = 0 ;
  k < S . length ;
  k ++ ) {
    if ( S . charAt ( k ) == 'B' ) num ++ ;
    else cnt += num ;
  }
  System . out . println ( cnt ) ;
}
