public static int input ( ) {
  int A = 0 ;
  int Z = 0 ;
  int flg = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == 'A' && flg == 0 ) {
      A = i ;
      flg = 1 ;
    }
    if ( S . charAt ( i ) == 'Z' ) Z = i ;
  }
  return Z - A + 1 ;
}
