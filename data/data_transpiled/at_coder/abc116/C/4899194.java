public static int N = Integer . parseInt ( input ) {
  int [ ] H = Lists . newArrayList ( ) . stream ( ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int cnt = 0 ;
  for ( int i = 1 ;
  i < 101 ;
  i ++ ) {
    boolean flg = false ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( H [ j ] >= i ) {
        flg = true ;
      }
      else if ( flg ) {
        flg = false ;
        cnt ++ ;
      }
    }
    if ( flg ) {
      cnt ++ ;
    }
  }
  return cnt ;
}
