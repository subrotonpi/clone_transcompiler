public static int N = Integer . parseInt ( input ) {
  int [ ] H = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    H [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int cnt = 0 ;
  for ( ;
  ;
  ) {
    if ( ArrayUtils . isEmpty ( H ) == false ) break ;
    cnt ++ ;
    boolean f = false ;
    for ( int i = 0 ;
    i < H . length ;
    i ++ ) {
      if ( H [ i ] > 0 ) {
        H [ i ] -- ;
        f = true ;
      }
      else if ( f && H [ i ] == 0 ) break ;
    }
  }
  System . out . println ( cnt ) ;
  return cnt ;
}
