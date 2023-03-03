public static int N = Integer . parseInt ( input ) {
  int [ ] H = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < H . length ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = 0 ;
  for ( int i = 1 ;
  i < 101 ;
  i ++ ) {
    boolean flg = false ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( H [ j ] < i && flg ) cnt ++ ;
      flg = H [ j ] >= i ;
    }
    if ( flg ) cnt ++ ;
  }
  return cnt ;
}
