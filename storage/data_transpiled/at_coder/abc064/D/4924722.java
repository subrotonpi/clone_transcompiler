public static int N = Integer . parseInt ( input ) {
  String S = input . next ( ) ;
  int lCnt = 0 ;
  for ( int i = S . length ( ) - 1 ;
  i >= 0 ;
  i -- ) {
    switch ( S . charAt ( i ) ) {
      case ')' : lCnt ++ ;
      break ;
      case '(' : if ( lCnt != 0 ) -- lCnt -- ;
    }
  }
  int rCnt = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    switch ( S . charAt ( i ) ) {
    }
  }
  return rCnt ;
}
