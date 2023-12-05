public static int N = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] R = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    R [ i ] [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
  }
  return R [ 0 ] [ 0 ] ;
}
