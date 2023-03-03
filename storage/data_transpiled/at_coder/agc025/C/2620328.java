public static int N = Integer . parseInt ( input ) {
  int [ ] L = new int [ N ] , R = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    R [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  L [ 0 ] = 0 ;
  R [ 0 ] = 0 ;
  return 0 ;
}
