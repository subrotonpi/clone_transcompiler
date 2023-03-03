public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int flg = 0 ;
  for ( int i = 0 ;
  i < N / 4 + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < N / 7 + 1 ;
    j ++ ) {
      if ( N == 4 * i + 7 * j ) {
        flg = 1 ;
      }
    }
  }
  if ( flg == 1 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
